package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fefu_food_app.model.Product;
import com.example.fefu_food_app.model.ProductCategory;
import com.example.fefu_food_app.model.UserData;
import com.example.fefu_food_app.model.UserSettings;

public class MenuActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewNumber;
    private TextView mTextViewCard;

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

    }
}