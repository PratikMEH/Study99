package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class university_topic1 extends AppCompatActivity {
    PDFView ut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Design Analysis And Agorithm");
        setContentView(R.layout.activity_university_topic1);
        ut1=findViewById(R.id.unv1);
        ut1.fromAsset("veera burla.pdf").load();
    }
}
