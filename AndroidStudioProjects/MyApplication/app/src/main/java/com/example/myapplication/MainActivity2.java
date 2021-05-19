package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Set;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.widget.Button;
import android.widget.ListView;

import android.bluetooth.le.BluetoothLeScanner;

public class MainActivity2 extends AppCompatActivity {
    private Button On,Off,Visible,list;
    private BluetoothAdapter BA;
    private Set<BluetoothDevice>pairedDevices;
    private ListView lv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        On = (Button)findViewById(R.id.button_scan);
        Off = (Button)findViewById(R.id.button_scan);

        BA = BluetoothAdapter.getDefaultAdapter();
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(mBluetoothAdapter!=null) {
            BluetoothLeScanner mBluetoothLeScanner
                    =mBluetoothAdapter.getBluetoothLeScanner();
        }

    }

    public void example2(View view) {
        Intent i = new Intent();
        i.setClass(MainActivity2.this,MainActivity3.class);
        startActivity(i);
        MainActivity2.this.finish();
    }
}