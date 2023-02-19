package dev.prtjohanson.exc_2023_02_18.exc10to13;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Basket {
    private HashMap<Product, Integer> quantityByProduct = new HashMap<>();

    public Basket add(Product product, Integer quantityToAdd) {
        if (!(quantityToAdd != 0)) {
            throw new RuntimeException("Quantity to add or remove must not be 0");
        }

        final Integer existingQuantity = quantityByProduct.containsKey(product) ? quantityByProduct.get(product) : 0;

        final Integer newQuantity = existingQuantity + quantityToAdd;

        if (newQuantity > 0) {
            quantityByProduct.put(product, newQuantity);
        } else if (newQuantity == 0) {
            quantityByProduct.remove(product);
        } else {
            throw new RuntimeException("Can't have a negative quantity of product");
        }

        return this;
    }

    public Basket remove(Product product, Integer quantityToRemove) {
        add(product, -quantityToRemove);
        return this;
    }

    public Stream<Map.Entry<Product, Integer>> getAllProductsWithQuantity() {
        return quantityByProduct.entrySet().stream();
    }

    @Override
    public String toString() {
        return "Basket{\n" +
                "quantityByProduct=" + quantityByProduct +
                "\n}\n";
    }
}
