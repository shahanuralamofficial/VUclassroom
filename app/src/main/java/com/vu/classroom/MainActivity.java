package com.vu.classroom;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/** @noinspection unused*/
public class MainActivity extends AppCompatActivity {


    public Button fiSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fiSemester = findViewById(R.id.fiSemester);

        fiSemester.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, Activity2.class);
            MainActivity.this.startActivity(myIntent);
        });
    }
}