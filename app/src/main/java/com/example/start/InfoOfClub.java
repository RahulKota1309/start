package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class InfoOfClub extends AppCompatActivity {
    private ImageView imgfromclub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_of_club);

        imgfromclub=findViewById(R.id.imgfromclub);
        Intent intent=getIntent();
        imgfromclub.setImageResource(intent.getIntExtra("image",0));

    }
}
