package com.vu.classroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnOne = findViewById(R.id.btnOne);

        btnOne.setOnClickListener(v -> {
        Intent myIntent = new Intent(Activity2.this, PdfActivity.class);
        startActivity(myIntent);
        });
    }
}