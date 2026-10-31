package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class AnimalFactory {

    private static final Map<String, SubFactory> subFactoryMap = new HashMap<>();

    static {
        ServiceLoader<SubFactory> loader = ServiceLoader.load(SubFactory.class);
        for (SubFactory provider : loader) {
            subFactoryMap.put(provider.getType(), provider);
        }

    }

    public static Animal createClassWithFactory(String factoryType , String classType) {
        if (!subFactoryMap.containsKey(factoryType)) {
            throw new IllegalArgumentException("No such factory: " + factoryType);
        }
        SubFactory subFactory = getSubFactory(factoryType);
        return  subFactory.createProduct(classType);
    }

    public static SubFactory getSubFactory(String type) {
        SubFactory subFactory = subFactoryMap.get(type);
        if (subFactory == null) {
            throw new IllegalArgumentException("Unknown payment type: " + type);
        }
        return subFactory;
    }

    public static Animal getAnimal(String type) {
        for (SubFactory value : subFactoryMap.values()) {
            if (value.exists(type)) {
                return value.createProduct(type);
            }
        }
        return null;
    }
    private AnimalFactory() {}
}
