package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;

public class kitab4 extends AppCompatActivity {
    Button buy41,buy42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Books");
        setContentView(R.layout.activity_kitab4);
        buy41=findViewById(R.id.buy41);
        buy42=findViewById(R.id.buy42);
        buy41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.flipkart.com/data-structures-algorithms-python/p/itmfyecvqptqjxad"));
                startActivity(intent);
            }
        });
        buy42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.amazon.in/Structures-Algorithms-Python-Michael-Goodrich/dp/1118290275"));
                startActivity(intent);
            }
        });

    }
}
