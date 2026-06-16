package com.example.enquiry_form_assignment;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.enquiry_form_assignment.R;

public class MainActivity extends AppCompatActivity {

    Resources resources;

    ImageView img;
    TextView txtWelcome, txtEnquiry, name, phone, email, yearPassing, college, technology;

    EditText ename, ephone, eemail, eyearPassing, ecollege, etechnology;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resources = getResources();

        img = findViewById(R.id.image);

        txtWelcome = findViewById(R.id.txtWelcome);
        txtEnquiry = findViewById(R.id.txtEnquiry);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        yearPassing = findViewById(R.id.yearPassing);
        college = findViewById(R.id.college);
        technology = findViewById(R.id.technology);

        ename = findViewById(R.id.ename);
        ephone = findViewById(R.id.ephone);
        eemail = findViewById(R.id.eemail);
        eyearPassing = findViewById(R.id.eyearPassing);
        ecollege = findViewById(R.id.ecollege);
        etechnology = findViewById(R.id.etechnology);

        btnSubmit = findViewById(R.id.btnSubmit);
    }
}

