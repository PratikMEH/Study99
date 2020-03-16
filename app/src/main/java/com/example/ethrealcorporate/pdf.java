package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class pdf extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Study99");
        setContentView(R.layout.activity_pdf);
        tabLayout=findViewById(R.id.tablayout11);
        viewPager=findViewById(R.id.view_pager11);
        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.AddFragments(new Fragment_books(),"Books");
        adapter.AddFragments(new Fragment_topics(),"Topics");
       viewPager.setAdapter(adapter);
       tabLayout.setupWithViewPager(viewPager);
    }
}
