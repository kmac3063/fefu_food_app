package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    ImageView mImageViewClient;
    ImageView mImageViewCostumer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mImageViewClient = findViewById(R.id.image_view29);
        mImageViewClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileActivity.this, CategoriesActivity.class);
                startActivity(i);
            }
        });
        mImageViewCostumer = findViewById(R.id.image_view28);
    }
}