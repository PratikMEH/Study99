package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Topics extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    RelativeLayout tpc1,tpc2,tpc3,tpc4;
    ImageView b1,b2,b3,b4;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle2;
    Toolbar toolbar2;
    NavigationView navigationView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        b1=findViewById(R.id.but1);
        b2=findViewById(R.id.but2);
        b3=findViewById(R.id.but3);
        b4=findViewById(R.id.but4);

        drawerLayout=findViewById(R.id.drawer_topic);
        toolbar2=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setTitle("Topics");
        navigationView2=findViewById(R.id.navigation_view);
        actionBarDrawerToggle2= new ActionBarDrawerToggle(this,drawerLayout,toolbar2,(R.string.open),(R.string.close));
        drawerLayout.addDrawerListener(actionBarDrawerToggle2);
        actionBarDrawerToggle2.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle2.syncState();
        navigationView2.setNavigationItemSelectedListener(this);

        tpc1=findViewById(R.id.tpc1);
        tpc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Topics.this,topic_1.class);
                startActivity(intent);
            }
        });


        final AlertDialog.Builder builder =new AlertDialog.Builder(Topics.this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Add Bookmark?");
                builder.setMessage("Wish to add this topic into Bookmark ?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert= builder.create();
                alert.show();
                alert.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Add Bookmark?");
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert= builder.create();
                alert.show();
                builder.setMessage("Wish to add this topic into Bookmark ?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Add Bookmark?");
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert= builder.create();
                alert.show();
                builder.setMessage("Wish to add this topic into Bookmark ?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Add Bookmark?");
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert= builder.create();
                alert.show();
                builder.setMessage("Wish to add this topic into Bookmark ?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.show();
            }
        });




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        switch (id)
        {
            case R.id.drwProfile:
                Intent intent= new Intent(Topics.this,Prfl.class);
                startActivity(intent);
                finish();
                break;
            case R.id.drwBooks:
                Intent intent4= new Intent(Topics.this,Books.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.drwBookmarks:
                Intent intent1=new Intent(Topics.this,Bookmarks.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.drwActivities:
                Intent intent5= new Intent(Topics.this,Activities.class);
                startActivity(intent5);
                finish();
            case R.id.drwRecommendation:
                Intent intent2=  new Intent(Topics.this,Recommendation.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.drwFacebook:
                Intent intent6=new Intent(android.content.Intent.ACTION_VIEW);
                intent6.setData(Uri.parse("https://www.facebook.com/"));
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
                Intent intent11 = new Intent(Topics.this,Settings.class);
                startActivity(intent11);
                finish();
                break;
            case R.id.drwLogout:
                Intent intent3=new Intent(Topics.this,MainActivity.class);
                startActivity(intent3);
                finish();
                break;
            default:
                return false;
        }

        return true;
    }
}
