package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fefu_food_app.model.Order;

public class OrderActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTextView1;
    ImageView mImageView1;
    ImageView mImageView2;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        String money_from_previous_activity = getIntent().getStringExtra("KEY1");

        mTextView = findViewById(R.id.ooresult_text_view);
        mTextView.setText(money_from_previous_activity);

        mTextView1 = findViewById(R.id.ooomoyaoborona);
        mImageView1 = findViewById(R.id.plusooссamimage_view1);
        mImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mTextView1.getText().toString();
                mTextView1.setText("" + (Integer.valueOf(s) + 10));
            }
        });
        mImageView2 = findViewById(R.id.minusooссamimage_view1);
        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mTextView1.getText().toString();
                if (Integer.valueOf(s) - 10 < 0) return;
                mTextView1.setText("" + (Integer.valueOf(s) - 10));
            }
        });

        mImageView = findViewById(R.id.imageView100);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OrderActivity.this, "Отлично! Ожидайте подтверждения заказчика.", Toast.LENGTH_SHORT)
                        .show();
                Intent i = new Intent(OrderActivity.this,  CustomerMenuActivity.class);
                startActivity(i);
            }
        });
    }
}