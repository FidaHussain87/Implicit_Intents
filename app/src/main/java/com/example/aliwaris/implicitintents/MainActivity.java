package com.example.aliwaris.implicitintents;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callBtn(View v) {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:03002229880"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(i);

    }
    public void cameraBtn(View v){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
    public void contactBtn(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://contacts/people/"));
        startActivity(i);
    }
    public void browserBtn(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.google.com/"));
        startActivity(i);

    }
    public void calllogBtn(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://call_log/calls"));
        startActivity(i);
    }
    public void dialpadBtn(View v){
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:03002229880"));
        startActivity(i);

    }
    public void gallaryBtn(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://media/external/images/media/"));
        startActivity(i);
    }


}
