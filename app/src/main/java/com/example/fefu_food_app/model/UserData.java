package com.example.fefu_food_app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData {
    private static UserData userData;
    private List<Product> products;
    private UserData() {
        currentOrder = new Order();
        // TODO load user settings from saved
        userSettings = new UserSettings();
        products = new ArrayList<>(Arrays.asList(
                new Product("1", null, "sd", null),
                new Product("1", null, "sd", null)
                ));
    }

    public static UserData getUserData() {
        if (userData == null) {
            userData = new UserData();
        }

        return userData;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    private Order currentOrder;
    private UserSettings userSettings;

    public List<Product> getProducts(ProductCategory category) {
        List<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (category.equals(product.getCategory())) {
                filtered.add(product);
            }
        }
        return filtered;
    }

}
