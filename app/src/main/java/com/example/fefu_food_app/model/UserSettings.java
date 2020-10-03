package com.example.fefu_food_app.model;

import android.graphics.Bitmap;

import com.example.fefu_food_app.model.Order;

import java.util.ArrayList;

public class UserSettings {

    public UserSettings() {
        phone = "88005553535";
        name = "Иван";
        surname = "Бубенчиков";
        card = "1111222233334444";
        cardExpiryDate = "05/33";
        cvv = "000";
        corpus = "1.8";
        room = "666";
    }

    public String phone;
    public String name;
    public String surname;
    public String card;
    public String cardExpiryDate;
    public String cvv;
    public String corpus;
    public String room;
}
