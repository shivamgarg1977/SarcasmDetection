package com.shivamgarg.sarcasmdetection.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.shivamgarg.sarcasmdetection.R;

public class DashBoard extends AppCompatActivity {

    CardView navigationBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Log.d("Successfully Created", "DashBoard: running");
        navigationBanner = findViewById(R.id.navigation_banner);


    }
}