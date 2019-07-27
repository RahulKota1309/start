package com.example.start;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imgback;
   // private RadioGroup radioGroup;
private Button btnstd,btnclub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Users");
btnstd=findViewById(R.id.btnstd);
btnclub=findViewById(R.id.btnclub);

btnclub.setOnClickListener(this);
btnstd.setOnClickListener(this);
       // imgback=findViewById(R.id.imgback);
//radioGroup=findViewById(R.id.radgroup);
//radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//    @Override
//    public void onCheckedChanged(RadioGroup group, int checkedId) {
//       // Toast.makeText(MainActivity.this, "hi i am rahul kota", Toast.LENGTH_SHORT).show();
//        switch(checkedId){
//            case R.id.radstd:
//                Toast.makeText(MainActivity.this, "welcome student name", Toast.LENGTH_SHORT).show();
//                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent);
//
//                break;
//            case R.id.radsec:
//               // Toast.makeText(MainActivity.this, "welcome secretary name", Toast.LENGTH_SHORT).show();
//                Intent intent1=new Intent(MainActivity.this,Secretary.class);
//                startActivity(intent1);
//                break;
//
//        }
//    }
//});



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnstd:
                Intent intent =new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btnclub:
                Intent intent1=new Intent (MainActivity.this,Secretary.class);
                startActivity(intent1);
                break;

        }
    }
}
