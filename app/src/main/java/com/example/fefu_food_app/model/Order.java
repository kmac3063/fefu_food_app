package com.example.fefu_food_app.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public ArrayList<Product> products;

    Order() {
        products = new ArrayList<>();
    }

    public void removeProduct(int index) {
        products.remove(index);
    }

    /**
     * example
     *
     * order.addProduct(
     *     new Product(
     *         name, // String
     *         new Money(
     *             price // int
     *         ),
     *         additionalWishse // String
     *         category // ProductCategory
     *     )
     * );
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts(ProductCategory category) {
        List<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (category.equals(product.getCategory())) {
                filtered.add(product);
            }
        }
        return filtered;
    }

    public Money calculateSum() {
        Money sum = new Money(0);
        for (Product product : products) {
            sum.add(product.getPrice());
        }

        return sum;
    }
}
