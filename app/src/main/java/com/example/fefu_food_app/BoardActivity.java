package com.example.fefu_food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class BoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        ArrayList<Pair<String, String>> spisok_for_IGOR = new ArrayList<>(Arrays.asList(
                new Pair<String, String>("Иванов Александр", "300 руб"),
                new Pair<String, String>("Александров Иван", "540 руб"),
                new Pair<String, String>("Волобуев ВотВашМеч", "202 руб"),
                new Pair<String, String>("Сонный Игорь", "511 руб"),
                new Pair<String, String>("Андроидный Студий", "200 руб"),
                new Pair<String, String>("Петров Петр", "1300 руб"),
                new Pair<String, String>("Сидоров Дмитрий", "190 руб"),
                new Pair<String, String>("Бульба Наталья", "280 руб"),
                new Pair<String, String>("Восточная Марья", "700 руб"),
                new Pair<String, String>("Цифровой Прорыв", "3000 руб"),
                new Pair<String, String>("Гейтс Билл", "560 руб")
        ));
    }
}