package com.example.ethrealcorporate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class book_pdf1 extends AppCompatActivity {
    PDFView book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Introduction To Algorithm");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_pdf1);
        book1=findViewById(R.id.pdf_v1);
        book1.fromAsset("cormen.pdf").load();
    }

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
                return true;
        }
        return false;
    }
}
