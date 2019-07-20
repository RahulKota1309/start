package com.example.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Results extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabAdapter tabAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        setTitle("Results");

        toolbar=findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
        viewPager=findViewById(R.id.viewpager);
        tabAdapter=new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);

    tabLayout=findViewById(R.id.tabLayout);
    tabLayout.setupWithViewPager(viewPager,false);

    }
}
