package com.example.recyclerview_assignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_assignment.ProductAdapter;
import com.example.recyclerview_assignment.ProductDetailActivity;
import com.example.recyclerview_assignment.R;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerCart = findViewById(R.id.recyclerCart);

        ProductAdapter adapter = new ProductAdapter(
                CartActivity.this,
                ProductDetailActivity.cartList);

        recyclerCart.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerCart.setAdapter(adapter);
    }
}