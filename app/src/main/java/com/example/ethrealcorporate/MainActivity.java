package com.example.ethrealcorporate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    TextView frgt,sig;
    Button b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        email=(EditText)findViewById(R.id.ed1);
        pass=(EditText)findViewById(R.id.editText);
        sig=(TextView) findViewById(R.id.create);
        frgt=findViewById(R.id.fot);
        frgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Forget.class);
                startActivity(intent);
            }
        });
        final String em="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
                finish();
            }
        });



        b=findViewById(R.id.bt1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
                if(email.getText().toString().isEmpty())
                {
                    builder.setTitle("Alert");
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
                    builder.setTitle("Successful");
                    builder.setMessage("Email Varified").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent= new Intent(MainActivity.this, Dashboard.class);
                            startActivity(intent);
                            finish();

                        }
                    });
                    AlertDialog alert =builder.create();
                    alert.show();
                }
               else
                {
                    builder.setTitle("Invalid Email");
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
