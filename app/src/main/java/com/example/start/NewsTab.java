package com.example.start;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsTab extends Fragment {

private ArrayList<String> arrayList2;
    public NewsTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news_tab, container, false);

        arrayList2=new ArrayList<>();
        arrayList2.add("Rahul");
        arrayList2.add("danussh");
        arrayList2.add("ds");
        arrayList2.add("manish");
        arrayList2.add("sreekanth");
        arrayList2.add("sagar");
        arrayList2.add("gowtham");
        arrayList2.add("sandeep");

        RecyclerView recyclerView=view.findViewById(R.id.recyclerview);
        Recycleadapter recycleadapter=new Recycleadapter(getContext(),arrayList2);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(recycleadapter);
        return view;
    }

}
