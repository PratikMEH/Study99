package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

import java.io.PrintWriter;

public class Books extends AppCompatActivity {
    private RatingBar ratingBar1,ratingBar2,ratingBar3,ratingBar4;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Recommended Books");
        setContentView(R.layout.activity_books);
        ratingBar1=findViewById(R.id.rb1);
        ratingBar2=findViewById(R.id.rb2);
        ratingBar3=findViewById(R.id.rb3);
        ratingBar4=findViewById(R.id.rb4);
        ratingBar1.setMax(5);
        ratingBar2.setRating((float) 4.5);
        ratingBar3.setRating((float) 3.5);
        ratingBar4.setRating(5);
        ratingBar1.setRating(3);
        ratingBar1.setIsIndicator(true);
        ratingBar2.setIsIndicator(true);
        ratingBar3.setIsIndicator(true);
        ratingBar4.setIsIndicator(true);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Books.this,kitab1.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Books.this,kitab2.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Books.this,kitab3.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new  Intent(Books.this,kitab4.class);
                startActivity(intent);
            }
        });

    }
}
