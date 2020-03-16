package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book_pdf1 extends AppCompatActivity {
    PDFView book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Introduction To Algorithm");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_pdf1);
        book1=findViewById(R.id.pdf_v1);
        book1.fromAsset("cormen.pdf").load();
    }
}
