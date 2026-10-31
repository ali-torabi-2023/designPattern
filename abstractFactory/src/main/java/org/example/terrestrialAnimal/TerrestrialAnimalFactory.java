package org.example.terrestrialAnimal;



import org.example.SubFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class TerrestrialAnimalFactory  implements SubFactory {


    private static final Map<String, TerrestrialAnimal> terrestrialAnimalFactories = new HashMap<>();

    // این بلاکِ استاتیک فقط یک بار در طول عمر برنامه (توسط JVM) اجرا می‌شود
    public TerrestrialAnimalFactory() {
        ServiceLoader<TerrestrialAnimal> loader = ServiceLoader.load(TerrestrialAnimal.class);
        for (TerrestrialAnimal provider : loader) {
            terrestrialAnimalFactories.put(provider.getType(), provider);
        }
    }

    @Override
    public String getType() {
        return "terrestrial";
    }

    @Override
    public <T> T createProduct(String productType) {
        if (!terrestrialAnimalFactories.containsKey(productType)) {
            throw new IllegalArgumentException(productType + " is not a valid product type.");
        }
        TerrestrialAnimal terrestrialAnimal = terrestrialAnimalFactories.get(productType);
        if (terrestrialAnimal == null) {
            throw new IllegalArgumentException("Unknown payment type: " + productType);
        }
        return (T)terrestrialAnimal;
    }

    public boolean exists(String productType) {
        if (!terrestrialAnimalFactories.containsKey(productType)) return false;
        return true;
    }
}
