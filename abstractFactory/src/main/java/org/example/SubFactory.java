package org.example;

public interface SubFactory {
    String getType();

    <T> T createProduct(String productType);

    boolean exists(String productType);

}
