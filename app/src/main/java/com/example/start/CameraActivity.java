package com.example.start;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class CameraActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgcam;
    private Button btncam;
    private Button btnsend;
    private EditText edtdesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        imgcam=findViewById(R.id.imgcam);
        btncam=findViewById(R.id.btncam);
        btnsend=findViewById(R.id.btnsend);
        edtdesc=findViewById(R.id.edtdesc);

        btncam.setOnClickListener(this);
        EnableRuntimePermission();
    }

    private void EnableRuntimePermission() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(CameraActivity.this,
                Manifest.permission.CAMERA))
        {

            Toast.makeText(CameraActivity.this,"CAMERA permission allows us to Access CAMERA app", Toast.LENGTH_LONG).show();

        } else {

            ActivityCompat.requestPermissions(CameraActivity.this,new String[]{
                    Manifest.permission.CAMERA}, 0);

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncam:
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
                break;
            case R.id.btnsend:
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        imgcam.setImageBitmap(bitmap);





    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {

            case 0:

                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(CameraActivity.this,"Permission Granted, Now your application can access CAMERA.", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(CameraActivity.this,"Permission Canceled, Now your application cannot access CAMERA.", Toast.LENGTH_LONG).show();

                }
                break;
        }
    }
}
