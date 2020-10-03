package com.example.fefu_food_app.model;

public class Money {
    private int price;

    public Money(int price) {
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
        if (price % 100 == 0) {
            return Integer.toString(price / 100);
        }
        return Integer.toString(price / 100) + "." + Integer.toString(price % 100);
    }
}
