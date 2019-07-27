package com.example.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

public class Secretary extends AppCompatActivity {
    private Toolbar toolbar1;
    private ViewPager viewPager1;
    private TabLayout tabLayout1;
    private TabAdapter tabAdapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secretary);

        setTitle("ClubMembers");
        toolbar1=findViewById(R.id.myToolbar1);
        setSupportActionBar(toolbar1);
        viewPager1=findViewById(R.id.viewpager1);
        tabAdapter1=new TabAdapter(getSupportFragmentManager());
        viewPager1.setAdapter(tabAdapter1);

        tabLayout1=findViewById(R.id.tabLayout1);
        tabLayout1.setupWithViewPager(viewPager1,false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
switch(item.getItemId()){
    case R.id.logout:
        break;
    case R.id.settings:
        break;
    case R.id.camera:


        break;

}

        return super.onOptionsItemSelected(item);
    }
}
