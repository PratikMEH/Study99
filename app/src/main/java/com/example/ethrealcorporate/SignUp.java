package com.example.ethrealcorporate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView sig;
    EditText user,email,pass;
    CheckBox chk;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_up);
        user=findViewById(R.id.et1);
        email=findViewById(R.id.editText2);
        pass=findViewById(R.id.pass);
        chk=findViewById(R.id.chk1);
        button=findViewById(R.id.bt1);
        sig=findViewById(R.id.create);

        final String em="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder =new AlertDialog.Builder(SignUp.this);
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
                else if (email.getText().toString().trim().matches(em)) {
                    builder.setMessage("Email Varified").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (chk.isChecked()) {
                                Intent intent = new Intent(SignUp.this, MainActivity.class);
                                startActivity(intent);
                            } else if (user.getText().toString().isEmpty()) {
                                builder.setMessage("Enter User Name").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                                AlertDialog alert = builder.create();
                                alert.show();
                            } else if (pass.getText().toString().trim().isEmpty()) {
                                builder.setMessage("Please enter the Password").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                                AlertDialog alert = builder.create();
                                alert.show();
                            }
                            else
                            {
                                builder.setMessage("Please select Terms and Condition").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                                AlertDialog alert = builder.create();
                                alert.show();
                            }



                        }
                    });
                    AlertDialog alert = builder.create();
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