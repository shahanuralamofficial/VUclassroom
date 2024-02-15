package com.vu.classroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class PdfActivity extends AppCompatActivity {

    LinearLayout pdfOne, pdfTwo, pdfThree, pdfFour, pdfFive, pdfSix, pdfSeven, pdfEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        pdfOne = findViewById(R.id.pdfOne);
        pdfTwo = findViewById(R.id.pdfTwo);
        pdfThree = findViewById(R.id.pdfThree);
        pdfFour = findViewById(R.id.pdfFour);
        pdfFive = findViewById(R.id.pdfFive);
        pdfSix = findViewById(R.id.pdfSix);
        pdfSeven = findViewById(R.id.pdfSeven);
        pdfEight = findViewById(R.id.pdfEight);



    }
}