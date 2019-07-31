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
public class DescriptionTab extends Fragment {

private ArrayList<String> clubnames;
    public DescriptionTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_description_tab, container, false);

        clubnames=new ArrayList<>();
        clubnames.add("smriti");
        clubnames.add("Judo");
        clubnames.add("narthana");
        clubnames.add("face");
        clubnames.add("IEE");
        clubnames.add("prakriti");
        clubnames.add("chetana");
        clubnames.add("powerliftingclub");
        clubnames.add("yoga");
        clubnames.add("raga");
        clubnames.add("abhinaya");
        RecyclerView recyclerview1=view.findViewById(R.id.recyclerview1);
        RecyclerUpcoming recycleadapter1=new RecyclerUpcoming(getContext(),clubnames);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerview1.setLayoutManager(linearLayoutManager);

        recyclerview1.setAdapter(recycleadapter1);

        return view;
    }

}
