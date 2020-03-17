package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

public class Bookmarks extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ListView listView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle1;
    Toolbar toolbar;
    NavigationView navigationView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks);
        listView=findViewById(R.id.lv1);
        drawerLayout=findViewById(R.id.drawer_bkmrk);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bookmarks");
        navigationView1=findViewById(R.id.navigation_view);
        actionBarDrawerToggle1= new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle1);
        actionBarDrawerToggle1.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle1.syncState();
        navigationView1.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        switch (id)
        {
            case R.id.drwBooks:
                Intent intent= new Intent(Bookmarks.this,Books.class);
                startActivity(intent);
                finish();
                break;
            case R.id.drwProfile:
                Intent intent1=new Intent(Bookmarks.this,Prfl.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.drwRecommendation:
                Intent intent2=  new Intent(Bookmarks.this,Recommendation.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.drwLogout:
                Intent intent3=new Intent(Bookmarks.this,MainActivity.class);
                startActivity(intent3);
                finish();
                break;
            default:
                return false;
        }
        return true;
    }
}
