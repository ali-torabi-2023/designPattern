package org.example.aquaticAnimal;

import org.example.SubFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class AquaticAnimalFactory  implements SubFactory {


    private static final Map<String, AerialAnimal> AquaticAnimalFactories = new HashMap<>();

    // این بلاکِ استاتیک فقط یک بار در طول عمر برنامه (توسط JVM) اجرا می‌شود
    public AquaticAnimalFactory() {
        ServiceLoader<AerialAnimal> loader = ServiceLoader.load(AerialAnimal.class);
        for (AerialAnimal provider : loader) {
            AquaticAnimalFactories.put(provider.getType(), provider);
        }
    }


    @Override
    public String getType() {
        return "aquatic";
    }

    @Override
    public <T> T createProduct(String productType) {
        if (!AquaticAnimalFactories.containsKey(productType)) {
            throw new IllegalArgumentException(productType + " is not a valid product type.");
        }

        AerialAnimal processor = AquaticAnimalFactories.get(productType);
        if (processor == null) {
            throw new IllegalArgumentException("Unknown payment productType: " + productType);
        }
        return (T)processor;
    }

    @Override
    public boolean exists(String productType) {
        if (!AquaticAnimalFactories.containsKey(productType)) return false;
        return true;
    }
}
