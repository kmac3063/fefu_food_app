package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEditText1;
    EditText mEditText2;
    TextView mSendSMSTextView;
    TextView mGoNextTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edit_text1);
        mEditText2 = findViewById(R.id.edit_text2);
        mSendSMSTextView = findViewById(R.id.text3);
        mGoNextTextView = findViewById(R.id.text4);

        mSendSMSTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /***************ВРЕМЕННО*/
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                 /****************/
                if (Validator.checkPhoneNumber(mEditText1.getText().toString()) == false) {
                    Toast.makeText(MainActivity.this, "Введен неверный номер!", Toast.LENGTH_SHORT)
                            .show();
                    return;
                }
                if (mSendSMSTextView.getVisibility() == View.VISIBLE) {
                    mSendSMSTextView.setVisibility(View.INVISIBLE);
                    mEditText2.setVisibility(View.VISIBLE);
                }
            }
        });

        mGoNextTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditText2.getText().toString().equals("8008")) {
                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(intent);
                } else {
                    String s = mEditText2.getVisibility() == View.VISIBLE ? "Код неверный!" : "Получите смс!";
                    Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT)
                        .show();
                }
            }
        });
    }
}