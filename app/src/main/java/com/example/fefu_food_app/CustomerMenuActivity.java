package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerMenuActivity extends AppCompatActivity {
    TextView tx1;
    TextView tx2;
    ImageView imv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_menu);

        tx1 = findViewById(R.id.ссchange_phone_text_view);
        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerMenuActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });
        tx2 = findViewById(R.id.ссchange_card_text_view);
        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerMenuActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });

        imv1 = findViewById(R.id.ссinvisible_order);
        imv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerMenuActivity.this, BoardActivity.class);
                startActivity(i);
            }
        });
    }
}