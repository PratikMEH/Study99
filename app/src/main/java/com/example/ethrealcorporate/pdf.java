package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.TableLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class pdf extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle2;
    Toolbar toolbar2;
    NavigationView navigationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        tabLayout=findViewById(R.id.tablayout11);
        viewPager=findViewById(R.id.view_pager11);
        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.AddFragments(new Fragment_books(),"Books");
        adapter.AddFragments(new Fragment_topics(),"Topics");
       viewPager.setAdapter(adapter);
       tabLayout.setupWithViewPager(viewPager);

        drawerLayout=findViewById(R.id.drawer_pdf);
        toolbar2=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setTitle("Books");
        navigationView2=findViewById(R.id.navigation_view);
        actionBarDrawerToggle2= new ActionBarDrawerToggle(this,drawerLayout,toolbar2,(R.string.open),(R.string.close));
        drawerLayout.addDrawerListener(actionBarDrawerToggle2);
        actionBarDrawerToggle2.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle2.syncState();
        navigationView2.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.drwProfile:
                Intent intent= new Intent(pdf.this,Prfl.class);
                startActivity(intent);
                finish();
                break;
            case R.id.drwTopics:
                Intent intent4=new Intent(pdf.this,Topics.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.drwBooks:
                Intent intent12= new Intent(pdf.this,Books.class);
                startActivity(intent12);
                finish();
                break;
            case R.id.drwBookmarks:
                Intent intent1=new Intent(pdf.this,Bookmarks.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.drwActivities:
                Intent intent5= new Intent(pdf.this,Activities.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.drwRecommendation:
                Intent intent2=  new Intent(pdf.this,Recommendation.class);
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
                Intent intent11 = new Intent(pdf.this,Settings.class);
                startActivity(intent11);
                finish();
                break;
            case R.id.drwLogout:
                Intent intent3=new Intent(pdf.this,MainActivity.class);
                startActivity(intent3);
                finish();
                break;
            default:
                return false;
        }

        return true;
    }
}
