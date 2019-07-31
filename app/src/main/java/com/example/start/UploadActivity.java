package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UploadActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txtupload,txtUpcoming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        setTitle("Upload");
        txtupload=findViewById(R.id.txtupload);
        txtUpcoming=findViewById(R.id.txtupcoming);

        txtUpcoming.setOnClickListener(this);
        txtupload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.txtupload:
                Intent intent =new Intent (UploadActivity.this,CameraActivity.class);
                startActivity(intent);
                break;
            case R.id.txtupcoming:
                break;

        }
    }
}
