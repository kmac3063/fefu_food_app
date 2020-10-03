package com.example.fefu_food_app;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class OrderLab {
    private OrderLab lab;

    public OrderLab get(Context context) {
        if (lab == null) {
            lab = new OrderLab();
        }
        return lab;
    }

    private OrderLab() {

    }

    public List<Integer> getOrderList() {
        return new ArrayList<Integer>();
    }
}
