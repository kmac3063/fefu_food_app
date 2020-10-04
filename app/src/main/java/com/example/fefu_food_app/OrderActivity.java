package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        String money_from_previous_activity = getIntent().getStringExtra("KEY1");

        mTextView = findViewById(R.id.ooresult_text_view);
        mTextView.setText(money_from_previous_activity);


        one = findViewById(R.id.ooimage_view012);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        two = findViewById(R.id.ooback_text12);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    ImageView one;
    TextView two;
}