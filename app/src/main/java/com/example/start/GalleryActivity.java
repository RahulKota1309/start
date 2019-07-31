package com.example.start;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView imgfromgallery;


    private Button btnpost,btngallery;
private EditText edtclub,edtfees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        imgfromgallery=findViewById(R.id.imgfromgallary);
        btnpost=findViewById(R.id.btnpost);
        btngallery=findViewById(R.id.btngallery);
        edtclub=findViewById(R.id.edtclub);
        edtfees=findViewById(R.id.edtfees);


        btngallery.setOnClickListener(this);
        btnpost.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.btnpost:
                break;
            case R.id.btngallery:

selectImage();
                break;
        }
    }
    private void  selectImage(){

        if(Build.VERSION.SDK_INT<23) {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, 1000);
        }
        if (Build.VERSION.SDK_INT>=23){
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED)
            {

                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1000);
            }else
            {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 1000);
            }

        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==1000)
        {
            if (grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                selectImage();
            }
        }


    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1000&&resultCode==RESULT_OK&&data!=null){
            Uri selectedImage=data.getData();
            try{
               Bitmap bitmap=MediaStore.Images.Media.getBitmap(getContentResolver(),selectedImage);
                imgfromgallery.setImageBitmap(bitmap);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
