package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Activity");
        setContentView(R.layout.activity_activities);
    }
}
