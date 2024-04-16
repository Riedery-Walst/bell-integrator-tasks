package ru.andreev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {
    private final Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Количество не может быть равно нули или быть отрицательным значением");
        }
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Количество не может быть равно нули или быть отрицательным значением");
        }
        products.put(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
