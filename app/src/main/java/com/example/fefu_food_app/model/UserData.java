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
                new Product("Макароны", new Money(100), "", ProductCategory.GROCERY),
                new Product("Сыр", new Money(100), "", ProductCategory.GROCERY),
                new Product("Оливковое масло", new Money(100), "", ProductCategory.GROCERY),
                new Product("Гречка", new Money(100), "", ProductCategory.GROCERY),
                new Product("Рис", new Money(100), "", ProductCategory.GROCERY),
                new Product("Пшено", new Money(100), "", ProductCategory.GROCERY)
                ));
        ProductCategory[] cats = ProductCategory.values();
        for (ProductCategory cat : cats) {
            if (cat.equals(ProductCategory.GROCERY)) continue;
            for (int i = 1; i < 10; i++) {
                products.add(new Product("Продукт " + i,  new Money(i * 10 * 100), "", cat));
            }
        }
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
