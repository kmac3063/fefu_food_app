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
        //TO DO адаптер не работает
        //mRecyclerView.setAdapter(new ProdAdapter(list));
    }

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
            //Product p = mProducts.get(position);
            // holder.bind(p);
        }

        @Override
        public int getItemCount() {
            return mProducts.size();
        }

        class ProdViewHolder extends RecyclerView.ViewHolder {
            ImageView itemImageView1;
            TextView mTextView;
            Product p;

            public ProdViewHolder(View itemView) {
                super(itemView);
                itemImageView1 = itemView.findViewById(R.id.item_image_view1);
                mTextView = itemView.findViewById(R.id.item_text_view);
                itemImageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        UserData.getUserData().getCurrentOrder().addProduct(p);
                        Toast.makeText (BoardActivity.this, "a", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            public void bind(Product p1) {
                p = p1;
                mTextView.setText(p1.getName());
            }
        }
    }
}