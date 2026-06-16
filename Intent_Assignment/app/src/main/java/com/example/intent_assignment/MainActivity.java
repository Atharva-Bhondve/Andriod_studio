package com.example.intent_assignment;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Resources resources;
    ImageView imgmain;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView welcome_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initViews();
        attachListener();

    }

    public void initViews() {
        resources = getResources();
        imgmain = findViewById(R.id.MainImg);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        welcome_txt = findViewById(R.id.welcome_txt);
    }

    public void attachListener() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("player1", R.drawable.lion1);
                intent.putExtra("player2", R.drawable.lion2);
                intent.putExtra("player3", R.drawable.lion3);
                intent.putExtra("player4", R.drawable.lion4);
                startActivityForResult(intent, 1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("animal1", R.drawable.tiger1);
                intent.putExtra("animal2", R.drawable.tiger2);
                intent.putExtra("animal3", R.drawable.tiger3);
                intent.putExtra("animal4", R.drawable.tiger4);
                startActivityForResult(intent, 1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("animal1", R.drawable.elephant1);
                intent.putExtra("animal2", R.drawable.elephant2);
                intent.putExtra("animal3", R.drawable.elephant3);
                intent.putExtra("animal4", R.drawable.elephant4);
                startActivityForResult(intent, 1);            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("animal1", R.drawable.panda1);
                intent.putExtra("animal2", R.drawable.panda2);
                intent.putExtra("animal3", R.drawable.panda3);
                intent.putExtra("animal4", R.drawable.panda4);
                startActivityForResult(intent, 1);
            }
        });




    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == 1){
            int selectedImage =
                    data.getIntExtra("img1",0);
            imgmain.setImageResource(selectedImage);


        }

        if(requestCode == 1 && resultCode == 2){
            int selectedImage =
                    data.getIntExtra("img2",0);
            imgmain.setImageResource(selectedImage);

        }

        if(requestCode == 1 && resultCode == 3){
            int selectedImage =
                    data.getIntExtra("img3",0);
            imgmain.setImageResource(selectedImage);

        }

        if(requestCode == 1 && resultCode == 4){
            int selectedImage =
                    data.getIntExtra("img4",0);
            imgmain.setImageResource(selectedImage);

        }
    }
}