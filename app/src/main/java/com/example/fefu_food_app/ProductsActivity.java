package com.example.fefu_food_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fefu_food_app.model.Order;
import com.example.fefu_food_app.model.Product;
import com.example.fefu_food_app.model.ProductCategory;
import com.example.fefu_food_app.model.UserData;

import java.util.List;

public class ProductsActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    ImageView imV;
    TextView txV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        ProductCategory cat = ProductCategory.values()[savedInstanceState.getInt("FIRST")];
        List<Product> list = UserData.getUserData().getProducts(cat);

        mRecyclerView = findViewById(R.id.products_recycler);
        mRecyclerView.setAdapter(new ProdAdapter(list));

        imV = findViewById(R.id.image_view01);
        imV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        txV = findViewById(R.id.back_text1);
        txV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    class ProdViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImageView1;
        TextView mTextView;

        public ProdViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public ProdViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.layout_recycle_item, parent, false));
            itemImageView1 = findViewById(R.id.item_image_view1);
            mTextView = findViewById(R.id.item_text_view);
        }

        public void bind(Product p) {
            mTextView.setText(p.getName());
        }
    }

    private class ProdAdapter extends RecyclerView.Adapter<ProdViewHolder> {

        List<Product> mProducts;
        @NonNull
        @Override
        public ProdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(ProductsActivity.this);
            return new ProdViewHolder(layoutInflater, parent);
        }

        ProdAdapter(List<Product> prods) {
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
    }
}