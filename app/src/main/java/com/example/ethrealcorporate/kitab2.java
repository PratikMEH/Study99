package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kitab2 extends AppCompatActivity {
    Button buy21,buy22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Books");
        setContentView(R.layout.activity_kitab2);
        buy21=findViewById(R.id.buy21);
        buy22=findViewById(R.id.buy22);
        buy21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.flipkart.com/uda-9205-425-design-analy-algorithms-pan-first/p/itmdyttark6qredc"));
                startActivity(intent);
            }
        });
        buy22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.amazon.in/Design-Analysis-Algorithms-Mohan-Pandey/dp/8131803341"));
                startActivity(intent);
            }
        });
    }
}
