package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Prfl extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar1;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prfl);
        drawerLayout=findViewById(R.id.drawer_p);
        toolbar1=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("Profile");
        navigationView=findViewById(R.id.navigation_view);
        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar1,(R.string.open),(R.string.close));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
       return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        switch (id)
        {
            case R.id.drwBooks:
                Intent intent= new Intent(Prfl.this,Books.class);
                startActivity(intent);
                finish();
                break;
            case R.id.drwBookmarks:
                Intent intent1=new Intent(Prfl.this,Bookmarks.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.drwRecommendation:
                Intent intent2=  new Intent(Prfl.this,Recommendation.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.drwLogout:
                Intent intent3=new Intent(Prfl.this,MainActivity.class);
                startActivity(intent3);
                finish();
                break;
            default:
                return false;
        }


        return true;
    }
}
