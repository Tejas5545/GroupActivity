package com.example.groupactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay1,rellay2;
    Handler splash=new Handler();
    EditText edusn,edpass;
    Button btnlogin;
    Runnable r=new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rellay1=findViewById(R.id.rellay1);
        rellay2=findViewById(R.id.rellay2);
        edusn=findViewById(R.id.username);
        edpass=findViewById(R.id.password);
        btnlogin=findViewById(R.id.btnlogin);
        splash.postDelayed(r,5000);`
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edusn.getText().toString().equals("TejasPatel") && edpass.getText().toString().equals("123456"))
                {
                    Intent i=new Intent(getApplicationContext(),AboutUs.class);
                    startActivity(i);
                    finish();
                }
                else if(edusn.getText().toString().equals("KoshaPatel") && edpass.getText().toString().equals("123456"))
                {
                    Intent i=new Intent(getApplicationContext(),AboutUs.class);
                    startActivity(i);
                    finish();
                }
                else if(edusn.getText().toString().equals("ManjulaOdedra") && edpass.getText().toString().equals("123456"))
                {
                    Intent i=new Intent(getApplicationContext(),AboutUs.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    new AlertDialog.Builder(getApplicationContext()).setMessage("Invalid Credential").setPositiveButton("Try", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }).create().show();
                }
            }
        });

    }
}