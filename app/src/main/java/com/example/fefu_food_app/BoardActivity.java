package com.example.fefu_food_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fefu_food_app.model.Product;
import com.example.fefu_food_app.model.UserData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        mRecyclerView = findViewById(R.id.xproducts_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Pair<String, String>> list = new ArrayList<>(Arrays.asList(
                new Pair<String, String>("Иванов Александр", "300 руб"),
                new Pair<String, String>("Александров Иван", "540 руб"),
                new Pair<String, String>("Волобуев Вотвашмеч", "202 руб"),
                new Pair<String, String>("Сонный Игорь", "511 руб"),
                new Pair<String, String>("Андроидный Студий", "200 руб"),
                new Pair<String, String>("Петров Петр", "1300 руб"),
                new Pair<String, String>("Сидоров Дмитрий", "190 руб"),
                new Pair<String, String>("Бульба Наталья", "280 руб"),
                new Pair<String, String>("Восточная Марья", "700 руб"),
                new Pair<String, String>("Цифровой Прорыв", "3000 руб"),
                new Pair<String, String>("Гейтс Билл", "560 руб")
        ));
        mRecyclerView.setAdapter(new ProdAdapter(list));



        one = findViewById(R.id.ximage_view01);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        two = findViewById(R.id.xback_text1);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    ImageView one;
    TextView two;

    private class ProdAdapter extends RecyclerView.Adapter<ProdAdapter.ProdViewHolder> {

        List<Pair<String, String>> mProducts;
        @NonNull
        @Override
        public ProdAdapter.ProdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(BoardActivity.this)
                    .inflate(R.layout.layout_border_item, parent, false);
            return new ProdAdapter.ProdViewHolder(view);
        }

        ProdAdapter(List<Pair<String, String>> prods) {
            mProducts = prods;
        }

        @Override
        public void onBindViewHolder(@NonNull ProdViewHolder holder, int position) {
            holder.bind(mProducts.get(position));
        }

        @Override
        public int getItemCount() {
            return mProducts.size();
        }

        class ProdViewHolder extends RecyclerView.ViewHolder {
            TextView mTextViewx2;
            TextView mTextViewx3;
            TextView mTextViewx7;
            ImageView mImageViewx4;

            Pair<String, String> p;

            public ProdViewHolder(View itemView) {
                super(itemView);
                mTextViewx2 = itemView.findViewById(R.id.x2);
                mTextViewx3 = itemView.findViewById(R.id.x3);;
                mTextViewx7 = itemView.findViewById(R.id.x7);;
                mImageViewx4 = itemView.findViewById(R.id.x4);;
                mImageViewx4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText (BoardActivity.this, "Вы выбрали заказ!", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            public void bind(Pair<String, String> p1) {
                p = p1;
                mTextViewx2.setText(p1.first.split(" ")[0]);
                mTextViewx3.setText(p1.first.split(" ")[1]);
                mTextViewx7.setText(p1.second);
            }
        }
    }
}