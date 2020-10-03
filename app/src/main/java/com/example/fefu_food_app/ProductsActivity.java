package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fefu_food_app.model.Order;
import com.example.fefu_food_app.model.ProductCategory;

public class ProductsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        ProductCategory cat = ProductCategory.values()[savedInstanceState.getInt("FIRST")];
        //List<> list = ;

    }
}