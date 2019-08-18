package com.example.start;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerUpcoming extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<String> clubnames;
    private LayoutInflater layoutInflater;

public   RecyclerUpcoming(Context context,ArrayList<String> clubnames)
{
    this.context=context;
    this.clubnames=clubnames;
    layoutInflater=LayoutInflater.from(context);
}


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v=layoutInflater.inflate(R.layout.custumized_recycler_upcoming,parent,false);
    //v.setOnClickListener();
        MyViewHolder mv=new MyViewHolder(v);
        return mv;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder=(MyViewHolder)holder;
        myViewHolder.txtclub.setText(clubnames.get(position));


    }

    @Override
    public int getItemCount() {
        return clubnames.size();
    }
    public  class MyViewHolder extends RecyclerView.ViewHolder {
       TextView txtclub,txtfees;
       Button btnregister;
       ImageView imgevent;
        MyViewHolder(View itemview) {
            super(itemview);

        txtclub=itemview.findViewById(R.id.txtclub);
        txtfees=itemview.findViewById(R.id.txtfees);
        imgevent=itemview.findViewById(R.id.imgevent);
        btnregister=itemview.findViewById(R.id.btnregister);
        }


    }


}
