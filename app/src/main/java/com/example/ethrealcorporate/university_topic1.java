package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class university_topic1 extends AppCompatActivity {
    PDFView ut1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.share_actn:
                Intent shareIntent= new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String sharebody="Your file";
                String sharesubject="Subject";
                shareIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
                startActivity(Intent.createChooser(shareIntent,"Share Via"));
                break;
            default:
                return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Design Analysis And Agorithm");
        setContentView(R.layout.activity_university_topic1);
        ut1=findViewById(R.id.unv1);
        ut1.fromAsset("veera burla.pdf").load();




    }
}
