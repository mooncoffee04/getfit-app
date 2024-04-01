package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gymwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymwo);

        Spinner workoutSpinner = findViewById(R.id.spinner);

        @Override public boolean onOptionsItemSelected(MenuItem item) { // Change the map type based on the user's selection. switch (item.getItemId()) { case R.id.normal_map: mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL); return true; case R.id.hybrid_map: mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID); return true; case R.id.satellite_map:

            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE); return true; case R.id.terrain_map: mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN); return true; default: return super.onOptionsItemSelected(item); } }


// Define array of workout types
        String[] workoutTypes = {"Cardio", "Strength Training", "Yoga", "Pilates", "Crossfit", "HIIT"};

// Create adapter for spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, workoutTypes);

// Set dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Set adapter to spinner
        workoutSpinner.setAdapter(adapter);

// Optional: Set default selection
        workoutSpinner.setSelection(0);

        Map<String, List<String>> workoutOptions = new HashMap<>();
        workoutOptions.put("Cardio", Arrays.asList("Running", "Cycling", "Jumping Jacks"));
        workoutOptions.put("Strength Training", Arrays.asList("Push-ups", "Pull-ups", "Squats"));
        workoutOptions.put("Yoga", Arrays.asList("Hatha Yoga", "Vinyasa Yoga", "Ashtanga Yoga"));
        workoutOptions.put("Pilates", Arrays.asList("Mat Pilates", "Reformer Pilates"));
        workoutOptions.put("Crossfit", Arrays.asList("WOD 1", "WOD 2", "WOD 3"));
        workoutOptions.put("HIIT", Arrays.asList("Tabata", "AMRAP", "EMOM"));

    }


}