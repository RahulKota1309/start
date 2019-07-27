package com.example.start;

import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int tabposition) {

        switch(tabposition){
            case 0:
                NewsTab newsTab=new NewsTab();
                return newsTab;
            case 1:
                ClubsTab clubsTab=new ClubsTab();
                return clubsTab;
            case 2:
                return new DescriptionTab();

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int tabposition) {
       switch(tabposition){

           case 0:
               return"News";
           case 1:
               return "Clubs";
           case 2:
               return "Description";
               default:
                   return null;
       }
    }
}
