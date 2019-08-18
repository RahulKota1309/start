package com.example.start;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.gridlayout.widget.GridLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClubsTab extends Fragment {
   private GridView gridView;
  private  ArrayList<Integer> arrayList;
private ArrayList<String> arrayphotolist;



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

//String photourl="photos/";
//        RequestQueue requestQueue= Volley.newRequestQueue(getContext());
//        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, photourl, null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//try{
//    for(int i=0;i<response.length();i++){
//        arrayphotolist.add(response.getJSONObject(i).getString("photo"));
//    }
//}catch(JSONException j){
//    j.printStackTrace();
//}
//            }                                                                                   // this is used to get image from server
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getContext(),error.toString(),Toast.LENGTH_LONG).show();
//            }
//        });
//
//requestQueue.add(jsonArrayRequest);


       CustomAdapter customAdapter=new CustomAdapter(getContext(),arrayList);
       gridView.setAdapter(customAdapter);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //Switch(view.getId())
               Intent intent=new Intent(getContext(),InfoOfClub.class);
               intent.putExtra("image",arrayList.get(position));
               startActivity(intent);
           }
       });

        return view;

    }

}
