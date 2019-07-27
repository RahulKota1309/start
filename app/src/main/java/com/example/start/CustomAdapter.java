package com.example.start;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
  private ArrayList<Integer> arrayList1;
    LayoutInflater inflater;

    public CustomAdapter (Context context,ArrayList<Integer> arrayList1){
        this.arrayList1=arrayList1;
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList1.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {


      view=inflater.inflate(R.layout.custumized_grid,null);
        ImageView imgview=view.findViewById(R.id.image);
        imgview.setImageResource(arrayList1.get(position));
imgview.setPadding(10,10,10,10);
      return view;
    }
}
