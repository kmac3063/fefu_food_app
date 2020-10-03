package com.example.fefu_food_app.model;

public class UserData {
    private UserData userData;
    private UserData() {
        currentOrder = new Order();
        // TODO load user settings from saved
        userSettings = new UserSettings();
    }

    public UserData getUserData() {
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

}
