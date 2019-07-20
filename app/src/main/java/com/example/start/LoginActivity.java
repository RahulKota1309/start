package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtname,edtphone,edtid,edtpass;
    private Button btnsignup,btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtid=findViewById(R.id.edtid);
        edtname=findViewById(R.id.edtname);
        edtphone=findViewById(R.id.edtphone);
        edtpass=findViewById(R.id.edtpass);

        btnsignup=findViewById(R.id.btnsignup);
        btnlogin=findViewById(R.id.btnlogin);
        btnsignup.setOnClickListener(this);
        btnlogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnsignup:
                    if (edtpass.getText().toString().equals("")||edtname.getText().toString().equals("")||edtid.getText().toString().equals("")
                    ||edtphone.getText().toString().equals("")){

                        Toast.makeText(LoginActivity.this, "please enter your credentials", Toast.LENGTH_SHORT).show();
                    }
                    else{
                       // Intent intent=new Intent(LoginActivity.this,results.class);
Intent intent=new Intent(LoginActivity.this,Results.class);
startActivity(intent);

                    }



                break;
            case R.id.btnlogin:
                break;
        }
    }}