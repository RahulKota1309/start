package com.example.start;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.gridlayout.widget.GridLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClubsTab extends Fragment {
   private GridView gridView;
  private  ArrayList<Integer> arrayList;




    public ClubsTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_clubs_tab, container, false);
        gridView=view.findViewById(R.id.gridview);
        arrayList=new ArrayList<>();
        arrayList.add(R.drawable.cat);
        arrayList.add(R.drawable.student);
        arrayList.add(R.drawable.bird);


       CustomAdapter customAdapter=new CustomAdapter(getContext(),arrayList);
       gridView.setAdapter(customAdapter);

        return view;

    }

}
