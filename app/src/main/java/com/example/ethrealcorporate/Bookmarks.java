package com.example.ethrealcorporate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Bookmarks extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Bookmark");
        setContentView(R.layout.activity_bookmarks);
        listView=findViewById(R.id.lv1);
    }
}
