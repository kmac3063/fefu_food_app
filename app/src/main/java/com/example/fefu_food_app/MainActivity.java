package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEditText1;
    TextView mSendSMSTextView;
    TextView mGoNextTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edit_text1);
        mSendSMSTextView = findViewById(R.id.text3);
        mGoNextTextView = findViewById(R.id.text4);
    }
}