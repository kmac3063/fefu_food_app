package com.example.fefu_food_app.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Product> products;

    public Order() {
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

    public Money calculateSum() {
        Money sum = new Money(0);
        for (Product product : products) {
            sum.add(product.getPrice());
        }

        return sum;
    }
}
