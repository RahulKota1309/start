package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtname,edtid,edtpass;
    private Button btnsignup,btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtid=findViewById(R.id.edtid);
        edtname=findViewById(R.id.edtname);
       // edtphone=findViewById(R.id.edtphone);
        edtpass=findViewById(R.id.edtpass);

        btnsignup=findViewById(R.id.btnsignup);
        btnlogin=findViewById(R.id.btnlogin);
        btnsignup.setOnClickListener(this);
        btnlogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnsignup:
                    if (edtpass.getText().toString().equals("")||edtname.getText().toString().equals("")||edtid.getText().toString().equals("")
                   ){

                        Toast.makeText(LoginActivity.this, "please enter your credentials", Toast.LENGTH_SHORT).show();
                    }
                    else{
//                        String loginurl="";
//                        RequestQueue requestQueue=Volley.newRequestQueue(LoginActivity.this);
//JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.POST, loginurl,null,new Response.Listener<JSONArray>() {
//    @Override
//    public void onResponse(JSONArray response) {
//try{
//    if(response.getJSONObject(0).getString("priv").equals("user")){
//
//        Toast.makeText(LoginActivity.this, "user has logged in", Toast.LENGTH_SHORT).show();
//    }else{
//        Toast.makeText(LoginActivity.this, "admin has logged in", Toast.LENGTH_SHORT).show();
//    }
//}catch(JSONException j){
//    j.printStackTrace();
//}
//    }
//}, new Response.ErrorListener() {
//    @Override
//    public void onErrorResponse(VolleyError error) {
//        Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
//    }
//}){
//    @Override
//    protected Map<String, String> getParams() throws AuthFailureError {
//        Map<String,String> map=new HashMap<>();
//        map.put("name",edtname.getText().toString());
//        map.put("id",edtid.getText().toString());
//        map.put("pass",edtpass.getText().toString());
//        return map;
//    }
//};
//requestQueue.add(jsonArrayRequest);


Intent intent=new Intent(LoginActivity.this,Results.class);
startActivity(intent);

                    }

                break;
            case R.id.btnlogin:
                break;
        }
    }}