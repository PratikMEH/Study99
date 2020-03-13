package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class Prfl extends AppCompatActivity {
    RelativeLayout tpc1,tpc2,tpc3,tpc4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Profile");
        setContentView(R.layout.activity_prfl);
        tpc1=findViewById(R.id.Dsgn_anlys);
        tpc2=findViewById(R.id.asymp_anlys);
        tpc3=findViewById(R.id.rcrnc_rltn);
        tpc4=findViewById(R.id.dvd_conqr);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.item_1:
                Intent intent=new Intent(Prfl.this,MainActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.exmenu, menu);
        return true;

    }



}
