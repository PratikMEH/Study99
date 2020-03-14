package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kitab3 extends AppCompatActivity {
    Button buy31,buy32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitab3);
        buy31=findViewById(R.id.buy31);
        buy32=findViewById(R.id.buy32);
        buy31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.flipkart.com/design-methods-analysis-algorithms/p/itmdx9sce258ynvm?pid=9788120347465&lid=LSTBOK9788120347465OCXEMJ&marketplace=FLIPKART&cmpid=content_book_8003060057_u_8965229628_gmc_pla&tgi=sem,1,G,11214002,u,,,395332127672,,,,c,,,,,,,&ef_id=Cj0KCQjw3qzzBRDnARIsAECmrypiargjvrTYT0dJmjiZn_37GGHAmxTENtSES91rXS6GY_bQNwkLs6UaAsfaEALw_wcB:G:s&s_kwcid=AL!739!3!395332127672!!!u!295092701166!&gclid=Cj0KCQjw3qzzBRDnARIsAECmrypiargjvrTYT0dJmjiZn_37GGHAmxTENtSES91rXS6GY_bQNwkLs6UaAsfaEALw_wcB"));
                startActivity(intent);
            }
        });
        buy32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.amazon.in/Design-Methods-Analysis-Algorithms-Basu/dp/8120347463"));
                startActivity(intent);
            }
        });
    }
}
