package com.example.recyclerview_assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ProductDetailActivity extends AppCompatActivity {

    ImageView imgDetail;
    TextView txtDetailName, txtDetailPrice, txtDescription;
    Button btnAddCart;

    // Simple cart list (for learning purpose)
    public static ArrayList<Product> cartList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        // Initialize views
        imgDetail = findViewById(R.id.imgDetail);
        txtDetailName = findViewById(R.id.txtDetailName);
        txtDetailPrice = findViewById(R.id.txtDetailPrice);
        txtDescription = findViewById(R.id.txtDescription);
        btnAddCart = findViewById(R.id.btnAddCart);

        // Get data from Intent
        int image = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String price = getIntent().getStringExtra("price");
        String description = getIntent().getStringExtra("description");

        // Set data to views
        imgDetail.setImageResource(image);
        txtDetailName.setText(name);
        txtDetailPrice.setText(price);
        txtDescription.setText(description);

        // Add to cart button click
        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product product = new Product(image, name, price, description);
                cartList.add(product);

                Toast.makeText(ProductDetailActivity.this,
                        "Added to Cart",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}