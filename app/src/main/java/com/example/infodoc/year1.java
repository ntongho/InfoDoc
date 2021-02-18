package com.example.infodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class year1 extends AppCompatActivity {
    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1);

        myPDFViewer= findViewById(R.id.pdfViewer);
        myPDFViewer.fromAsset("year1.pdf").load();

    }
}
