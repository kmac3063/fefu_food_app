package com.example.fefu_food_app.model;

public class Money {
    private int price;

    Money(int price) {
        setMoney(price);
    }

    public void setMoney(int price) {
        this.price = price;
    }

    public void add(Money money) {
        this.price += money.price;
    }

    public String getMoney() {
        return this.toString();
    }

    @Override
    public String toString() {
        return Integer.toString(price / 100) + "." + Integer.toString(price % 100);
    }
}