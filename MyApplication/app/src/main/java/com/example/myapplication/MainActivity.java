package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hicis(View view){
        Intent browIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://quizcis.aboukir-institutes.com/"));
        startActivity(browIntent);


    }


    public void hithr(View view){
        Intent browIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://quiztour.aboukir-institutes.com/"));
        startActivity(browIntent);


    }
}

