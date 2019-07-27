package com.example.start;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycleadapter extends RecyclerView.Adapter{

    ArrayList<String> personnames;
    Context context;
    LayoutInflater layoutInflater;
    public Recycleadapter(Context context, ArrayList<String> personnames){

        this.context=context;
        this.personnames=personnames;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.custumized_recycler,viewGroup,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {
        MyViewHolder myViewHolder=(MyViewHolder)holder;
        myViewHolder.name.setText(personnames.get(i));

    }

    @Override
    public int getItemCount() {
        return personnames.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView imageView;
        ImageView imageView2;

        MyViewHolder(View itemview) {
            super(itemview);

            name = itemview.findViewById(R.id.textView);
            imageView=itemview.findViewById(R.id.imageView);
            imageView2=itemview.findViewById(R.id.imageview2);
        }


    }


}
