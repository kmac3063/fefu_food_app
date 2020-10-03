package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}