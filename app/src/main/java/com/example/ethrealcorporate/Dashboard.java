package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button profile,topic,books,activity,bookmark,recommendation,pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);
        profile=findViewById(R.id.prfbtn);
        topic=findViewById(R.id.tpcbtn);
        books=findViewById(R.id.bksbtn);
        activity=findViewById(R.id.actbtn);
        bookmark=findViewById(R.id.bkkmrkbtn);
        recommendation=findViewById(R.id.rcmndbtn);
        pdf=findViewById(R.id.pdfbtn);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Prfl.class);
                startActivity(intent);
            }
        });


        topic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Topics.class);
                startActivity(intent);
            }
        });


        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this, Books.class);
                startActivity(intent);
            }
        });


        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Activities.class);
                startActivity(intent);
            }
        });


        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Bookmarks.class);
                startActivity(intent);
            }
        });


        recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this,Recommendation.class);
                startActivity(intent);
            }
        });
        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this, com.example.ethrealcorporate.pdf.class);
                startActivity(intent);
            }
        });
    }
}
