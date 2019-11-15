package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_email;
    EditText et_password;
    Button btnAdmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
        et_email = (EditText) findViewById(R.id.txtEmail);
        et_password = (EditText) findViewById(R.id.btnPassword);
        btnAdmin =(Button)findViewById(R.id.btnSignIn);
        btnAdmin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences prefs = MainActivity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
                String statusLogin = prefs.getString("isLogin",null);
                SharedPreferences.Editor edit = prefs.edit();

                if(et_email.getText().toString().contains("@staff.ukdw.ac.id")){
                    edit.putString("isLogin","Admin");
                    edit.commit();
                    Intent intent = new Intent(MainActivity.this,AdminHome.class);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),"Bukan Email UKDW",Toast.LENGTH_SHORT);
                    toast.setMargin(100,100);
                    toast.show();
                }
            }
        });
    }}