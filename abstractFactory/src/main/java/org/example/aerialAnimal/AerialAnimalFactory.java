package org.example.aerialAnimal;

import org.example.SubFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class AerialAnimalFactory  implements SubFactory {

    private static final Map<String, AquaticAnimal> aerialAnimalFactories = new HashMap<>();

    // این بلاکِ استاتیک فقط یک بار در طول عمر برنامه (توسط JVM) اجرا می‌شود
    public AerialAnimalFactory() {
        ServiceLoader<AquaticAnimal> loader = ServiceLoader.load(AquaticAnimal.class);
        for (AquaticAnimal provider : loader) {
            aerialAnimalFactories.put(provider.getType(), provider);
        }
    }

    @Override
    public String getType() {
        return "aerial";
    }

    @Override
    public <T> T createProduct(String productType) {
        if (!aerialAnimalFactories.containsKey(productType)) {
            throw new IllegalArgumentException(productType + " is not aerial");
        }
        AquaticAnimal processor = aerialAnimalFactories.get(productType);
        if (processor == null) {
            throw new IllegalArgumentException("Unknown payment type: " + productType);
        }
        return (T)processor;
    }

    public boolean exists(String productType) {
        if (!aerialAnimalFactories.containsKey(productType)) return false;
        return true;
    }
}
