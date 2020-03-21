package com.example.ethrealcorporate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class topic_1 extends AppCompatActivity {
    Dialog mydialog;
    TextView button;
    EditText Review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Introduction");
        setContentView(R.layout.activity_topic_1);
        mydialog= new Dialog(this);
        button= findViewById(R.id.fdbck);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpopup();
            }
        });
    }
    public void showpopup()
    {
        TextView close;
        mydialog.setContentView(R.layout.feedback_custom);
        close= mydialog.findViewById(R.id.exit);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT ));
        mydialog.show();
    }

}
