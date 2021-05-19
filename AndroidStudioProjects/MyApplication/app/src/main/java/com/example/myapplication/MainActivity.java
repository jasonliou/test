package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x;



    }

    public void btn_onclick(View view) {
        Intent i = new Intent();
        i.setClass(MainActivity.this,MainActivity2.class);
        startActivity(i);
        MainActivity.this.finish();
    }


}