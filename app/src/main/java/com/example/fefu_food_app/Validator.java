package com.example.fefu_food_app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Validator {

    private static Set<String> corps = new HashSet<>(Arrays.asList(
            "1.8",
            "1.9",
            "1.10",
            "1.11",
            "2.1",
            "2.2",
            "2.3",
            "2.4",
            "2.5",
            "2.6",
            "2.7",
            "2.8",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6.1",
            "6.2",
            "7.1",
            "7.2",
            "8.1",
            "8.2",
            "9",
            "10",
            "11"
    ));

    static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+?\\d{11}");
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

    static boolean checkCorpus(String corpus) {
        return corps.contains(corpus);
    }

    static boolean checkRoom(String room) {
        return room.matches("\\d{3}");
    }

}
