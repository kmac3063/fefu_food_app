package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fefu_food_app.model.UserData;

public class MenuActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mTextView = findViewById(R.id.name_text_view);
        mTextView.setText("Здравствуйте, " + UserData.getUserData().getUserSettings().name + "!");

    }
}