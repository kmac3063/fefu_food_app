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

import com.example.fefu_food_app.model.Product;

import java.util.List;

public class BasketActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        mRecyclerView = findViewById(R.id.noproducts_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //UserData.getUserData().currentOrder.getList()
//        ProdAdapter adapter = new ProdAdapter();
//        mRecyclerView.setAdapter(adapter);
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