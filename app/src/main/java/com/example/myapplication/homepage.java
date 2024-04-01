package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class homepage extends AppCompatActivity {

    Button gymbutton , homebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        gymbutton = findViewById(R.id.button8);
        homebutton = findViewById(R.id.button7);

        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Here you can handle the selected date
                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(getApplicationContext(), "Selected Date: " + date, Toast.LENGTH_SHORT).show();
            }
        });

        gymbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), gymwo.class);
                startActivity(i);
            }
        });

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), homewo.class);
                startActivity(i);
            }
        });

    }

}