package com.example.ethrealcorporate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Forget extends AppCompatActivity {
    Button button;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_forget2);
        email=findViewById(R.id.eet);
        button=findViewById(R.id.fbt1);
        final String em="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =new AlertDialog.Builder(Forget.this);
                if(email.getText().toString().isEmpty())
                {
                    builder.setMessage("Please Enter Email Address").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
                else if (email.getText().toString().trim().matches(em))
                {
                    builder.setMessage("Email Varified").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent= new Intent(Forget.this, MainActivity.class);
                            startActivity(intent);

                        }
                    });
                    AlertDialog alert =builder.create();
                    alert.show();
                }
                else
                {
                    builder.setMessage("Enter A Valid Email Address").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
                }
            }
        });

    }
}
