package com.example.avinash.firstday;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.content.Context.WIFI_SERVICE;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.wifion);
        b2=(Button)findViewById(R.id.wifioff);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wf=(WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
                    wf.setWifiEnabled(true);
                    Toast.makeText(getApplicationContext(),"Wifi On",Toast.LENGTH_LONG).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wf=(WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
                wf.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(),"Wifi Off",Toast.LENGTH_LONG).show();
            }
        });






    }
}
