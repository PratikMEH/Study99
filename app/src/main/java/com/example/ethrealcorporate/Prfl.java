package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Prfl extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    CardView cardView1,cardView2,cardView3;
    DrawerLayout drawerLayout;
    LinearLayout Introduction;
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
        getSupportActionBar().show();
        navigationView=findViewById(R.id.navigation_view);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar1,(R.string.navigation_drawer_open),(R.string.navigation_drawer_close));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        actionBarDrawerToggle.syncState();
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);


        cardView1= findViewById(R.id.card1);
        cardView2= findViewById(R.id.card2);
        cardView3= findViewById(R.id.card3);

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
            case R.id.drwTopics:
                Intent intent4=new Intent(Prfl.this,Topics.class);
                startActivity(intent4);
                finish();
                break;
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
            case R.id.drwActivities:
                Intent intent5=new Intent(Prfl.this,Activities.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.drwRecommendation:
                Intent intent2=  new Intent(Prfl.this,Recommendation.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.drwFacebook:
                Intent intent6=new Intent(Intent.ACTION_VIEW);
                intent6.setData(Uri.parse("https://m.facebook.com"));
                startActivity(intent6);
                break;
            case R.id.drwGoogle:
                Intent intent7= new Intent(Intent.ACTION_VIEW);
                intent7.setData(Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
                startActivity(intent7);
                break;
            case R.id.drwTwitter:
                Intent intent8= new Intent(Intent.ACTION_VIEW);
                intent8.setData(Uri.parse("https://twitter.com/login?lang=en"));
                startActivity(intent8);
                break;
            case R.id.drwYoutube:
                Intent intent9= new Intent(Intent.ACTION_VIEW);
                intent9.setData(Uri.parse("https://www.youtube.com"));
                startActivity(intent9);
                break;
            case R.id.drwGithub:
                Intent intent10= new Intent(Intent.ACTION_VIEW);
                intent10.setData(Uri.parse("https://github.com"));
                startActivity(intent10);
                break;
            case R.id.drwSettings:
                Intent intent11 = new Intent(Prfl.this,Settings.class);
                startActivity(intent11);
                finish();
                break;
            case R.id.drwLogout:
                Intent intent3=new Intent(Prfl.this,MainActivity.class);
                startActivity(intent3);
                intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent3);
                finish();
                break;
            default:
                return false;
        }


        return true;
    }
}
