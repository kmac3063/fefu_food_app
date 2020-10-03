package com.example.fefu_food_app;

public class Validator {
    static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{11}");
    }

    static boolean checkCardNumber(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }

    static boolean checkCVV(String cvv) {
        return cvv.matches("\\d{3}");
    }

    static boolean checkExpiryDate(String expiryDate) {
        return expiryDate.matches("\\d{2}/\\d{2}");
    }


}
