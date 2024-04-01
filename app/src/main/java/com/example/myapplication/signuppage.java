package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class signuppage extends AppCompatActivity {

    Button backButton, proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

        backButton = findViewById(R.id.button5);
        proceedButton = findViewById(R.id.button6);

        backButton.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });

        proceedButton.setOnClickListener(view -> {
            // save into a database (sql query)
            Intent i = new Intent(getApplicationContext(), loginpages.class);
            startActivity(i);
        });
    }
}