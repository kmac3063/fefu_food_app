package com.example.fefu_food_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fefu_food_app.model.Money;
import com.example.fefu_food_app.model.Product;
import com.example.fefu_food_app.model.UserData;

import java.util.List;

public class BasketActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        mRecyclerView = findViewById(R.id.noproducts_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Product> products = UserData.getUserData().getCurrentOrder().getList();
        ProdAdapter adapter = new ProdAdapter(products);
        mRecyclerView.setAdapter(adapter);

        Money m = new Money(0);
        for (Product p : products)
            m.add(p.getPrice());

        mResultTextView = findViewById(R.id.result_text_view);
        mResultTextView.setText(m.toString() + " руб");
    }

    private class ProdAdapter extends RecyclerView.Adapter<ProdAdapter.ProdViewHolder> {

        List<Product> mProducts;
        @NonNull
        @Override
        public ProdAdapter.ProdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(BasketActivity.this)
                    .inflate(R.layout.layout_recycle_item, parent, false);
            return new ProdAdapter.ProdViewHolder(view);
        }

        ProdAdapter(List<Product> prods) {
            mProducts = prods;
        }

        @Override
        public void onBindViewHolder(@NonNull ProdAdapter.ProdViewHolder holder, int position) {
            Product p = mProducts.get(position);
            holder.bind(p);
        }

        @Override
        public int getItemCount() {
            return mProducts.size();
        }

        class ProdViewHolder extends RecyclerView.ViewHolder {
            ImageView itemImageView1;
            TextView mTextView;

            public ProdViewHolder(View itemView) {
                super(itemView);
                itemImageView1 = itemView.findViewById(R.id.item_image_view1);
                mTextView = itemView.findViewById(R.id.item_text_view);
            }

            public void bind(Product p) {
                mTextView.setText(p.getName());
                mTextView.setText("Удалить");
            }
        }
    }
}