package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

import com.google.android.material.navigation.NavigationView;

import java.io.PrintWriter;

public class Books extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private RatingBar ratingBar1,ratingBar2,ratingBar3,ratingBar4;
    Button b1,b2,b3,b4;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle2;
    Toolbar toolbar2;
    NavigationView navigationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        drawerLayout=findViewById(R.id.drawer_books);
        toolbar2=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setTitle("Books");
        navigationView2=findViewById(R.id.navigation_view);
        actionBarDrawerToggle2= new ActionBarDrawerToggle(this,drawerLayout,toolbar2,(R.string.open),(R.string.close));
        drawerLayout.addDrawerListener(actionBarDrawerToggle2);
        actionBarDrawerToggle2.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle2.syncState();
        navigationView2.setNavigationItemSelectedListener(this);


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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        switch (id)
        {
            case R.id.drwProfile:
                Intent intent= new Intent(Books.this,Prfl.class);
                startActivity(intent);
                finish();
                break;
            case R.id.drwBookmarks:
                Intent intent1=new Intent(Books.this,Bookmarks.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.drwRecommendation:
                Intent intent2=  new Intent(Books.this,Recommendation.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.drwLogout:
                Intent intent3=new Intent(Books.this,MainActivity.class);
                startActivity(intent3);
                finish();
                break;
            default:
                return false;
        }


        return true;
    }
}
