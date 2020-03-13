package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class kitab1 extends AppCompatActivity {
    private RatingBar ratingBarbk1;
    Button buyy1,buyy2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kitab1);

        getSupportActionBar().hide();
        buyy1=findViewById(R.id.buy1);
        buyy2=findViewById(R.id.buy2);
        ratingBarbk1=findViewById(R.id.rate1);
        buyy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent((android.content.Intent.ACTION_VIEW));
                intent.setData(Uri.parse("https://www.flipkart.com/design-analysis-algorithms-1st/p/itme3fcgmpsqf6zn?pid=9780198093695&lid=LSTBOK9780198093695URJ0U6&marketplace=FLIPKART&srno=s_1_1&otracker=search&fm=organic&iid=fb8d9011-e1ad-4e62-8a8f-f55802433414.9780198093695.SEARCH&ssid=x3caql5xn40000001584097809089&qH=6d953b56700ced1c"));
                startActivity(intent);
            }
        });
        buyy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.amazon.in/dp/0198093691"));
                startActivity(intent);
            }
        });


    }
}
