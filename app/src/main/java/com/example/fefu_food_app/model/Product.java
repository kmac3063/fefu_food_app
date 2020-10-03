package com.example.fefu_food_app.model;

public class Product {
    private String name;
    private Money price;
    private String additionalWishes;
    private ProductCategory category;

    public Product(String name, Money price, String additionalWishes, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.additionalWishes = additionalWishes;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public void setAdditionalWishes(String additionalWishes) {
        this.additionalWishes = additionalWishes;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    public String getAdditionalWishes() {
        return additionalWishes;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void addMoney(Money money) {
        this.price.add(money);
    }
}
