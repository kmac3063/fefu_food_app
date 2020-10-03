package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoriesActivity extends AppCompatActivity {

    TextView mTextView0;
    ImageView mImageView0;

    ImageView mImageView1;
    ImageView mImageView2;
    ImageView mImageView3;
    ImageView mImageView4;
    ImageView mImageView5;
    ImageView mImageView6;
    ImageView mImageView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        mImageView0 = findViewById(R.id.acimage_view0);
        mTextView0 = findViewById(R.id.acback_text);
        mTextView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mImageView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mImageView1 = findViewById(R.id.acimage_view1);
        mImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 1);
                startActivity(i);
            }
        });

        mImageView2 = findViewById(R.id.acimage_view2);
        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 2);
                startActivity(i);
            }
        });


        mImageView3 = findViewById(R.id.acimage_view3);
        mImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 3);
                startActivity(i);
            }
        });


        mImageView4 = findViewById(R.id.acimage_view4);
        mImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 4);
                startActivity(i);
            }
        });


        mImageView5 = findViewById(R.id.acimage_view5);
        mImageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 5);
                startActivity(i);
            }
        });


        mImageView6 = findViewById(R.id.acimage_view6);
        mImageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 6);
                startActivity(i);
            }
        });


        mImageView7 = findViewById(R.id.acimage_view7);
        mImageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoriesActivity.this, ProductsActivity.class);
                i.putExtra("FIRST", 7);
                startActivity(i);
            }
        });


    }
}