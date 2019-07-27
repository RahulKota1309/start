package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class StartingActivity extends AppCompatActivity {
    private GridView gridView1;
    private ArrayList<Integer> arrayList2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        gridView1=findViewById(R.id.gridview1);
        arrayList2=new ArrayList<>();
        arrayList2.add(R.drawable.cat);
        arrayList2.add(R.drawable.student);
        arrayList2.add(R.drawable.bird);


        CustomAdapter customAdapter1=new CustomAdapter(StartingActivity.this,arrayList2);
        gridView1.setAdapter(customAdapter1);

    }
}
