package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void example3(View view) {
        Intent i = new Intent();
        i.setClass(MainActivity3.this,MainActivity2.class);
        startActivity(i);
        MainActivity3.this.finish();
    }
}