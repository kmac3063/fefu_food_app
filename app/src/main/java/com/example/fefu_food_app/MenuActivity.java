package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fefu_food_app.model.Product;
import com.example.fefu_food_app.model.ProductCategory;
import com.example.fefu_food_app.model.UserData;
import com.example.fefu_food_app.model.UserSettings;

public class MenuActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewNumber;
    private TextView mTextViewCard;
    TextView mChangeNumberTextView;
    TextView mChangeCardTextView;
    ImageView mImageView1;
    TextView mTextView1;
    TextView mTextView2;
    TextView mCreateTextView;
    ImageView mBasketImageView;

    TextView mOrderSumTextView;
    TextView mCancelTextView;

    static String makeNumberBeautiful(String number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = number.length() - 1; i > number.length() - 3; --i)
            stringBuilder.append(number.charAt(i));
        stringBuilder.append('-');
        for (int i = number.length() - 3; i > number.length() - 5; --i)
            stringBuilder.append(number.charAt(i));
        stringBuilder.append('-');
        for (int i = number.length() - 5; i > number.length() - 8; --i)
            stringBuilder.append(number.charAt(i));
        stringBuilder.append(')');
        for (int i = number.length() - 8; i > number.length() - 11; --i)
            stringBuilder.append(number.charAt(i));
        stringBuilder.append('(');
        for (int i = number.length() - 11; i >= 0; --i)
            stringBuilder.append(number.charAt(i));
        return stringBuilder.reverse().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        UserSettings userSettings = UserData.getUserData().getUserSettings();

        mTextViewName = findViewById(R.id.name_text_view);
        mTextViewName.setText("Здравствуйте, " + userSettings.name + "!");

        mTextViewNumber = findViewById(R.id.phone_text_view);
        mTextViewNumber.setText(makeNumberBeautiful(userSettings.phone));

        mTextViewCard = findViewById(R.id.card_text_view);
        mTextViewCard.setText("****-****-****-**" + userSettings.card.substring(14));

        mTextView2 = findViewById(R.id.basket_sum);

        mImageView1 = findViewById(R.id.amimage_view0);
        mTextView1 = findViewById(R.id.amback_text);
        mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mChangeNumberTextView = findViewById(R.id.change_phone_text_view);
        mChangeNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });
        mChangeCardTextView = findViewById(R.id.change_card_text_view);
        mChangeCardTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });

        mCreateTextView = findViewById(R.id.amtext_view111);
        mCreateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, CategoriesActivity.class);
                startActivity(i);
            }
        });

        mBasketImageView = findViewById(R.id.amimage_view4);
        mBasketImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, BasketActivity.class);
                startActivity(i);
            }
        });

        mOrderSumTextView = findViewById(R.id.invisible_current_order_sum);
        mOrderSumTextView.setText("");

        mCancelTextView = findViewById(R.id.invisible_cancel_text_view);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mTextView2.setText(UserData.getUserData().getCurrentOrder().calculateSum().toString() + " руб.");
        mOrderSumTextView.setText(UserData.getUserData().cur_ord);
        if (UserData.getUserData().cur_ord.equals("0 руб.")) {
            mCancelTextView.setVisibility(View.INVISIBLE);
        } else {
            mCancelTextView.setVisibility(View.VISIBLE);
        }
    }
}