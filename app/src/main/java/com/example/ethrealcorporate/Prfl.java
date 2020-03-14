package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Switch;

import com.google.android.material.navigation.NavigationView;

public class Prfl extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    RelativeLayout tpc1,tpc2,tpc3,tpc4;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_prfl);
        tpc1=findViewById(R.id.Dsgn_anlys);
        tpc2=findViewById(R.id.asymp_anlys);
        tpc3=findViewById(R.id.rcrnc_rltn);
        tpc4=findViewById(R.id.dvd_conqr);
        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolbar);


        navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,(R.string.open),(R.string.close));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();



    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drawer_menu,menu);
        return true;

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if(menuItem.getItemId()==R.id.drwBooks)
        {
            Intent intent= new Intent(Prfl.this,Books.class);
            startActivity(intent);
        }
        if(menuItem.getItemId()==R.id.drwBookmarks)
        {

        }
        if (menuItem.getItemId()==R.id.drwRecommendation)
        {

        }
        if (menuItem.getItemId()== R.id.drwLogout)
        {

        }

        return true;
    }
}
