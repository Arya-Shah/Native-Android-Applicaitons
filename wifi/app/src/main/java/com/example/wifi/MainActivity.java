package com.example.wifi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Button Btnon;
    private Button Btnoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btnon=(Button)findViewById(R.id.Btnon);
        Btnoff=(Button)findViewById(R.id.Btnoff);

        Btnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wm1 = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wm1.setWifiEnabled(true);
                Toast.makeText(MainActivity.this, " Wifi is enabled", Toast.LENGTH_SHORT).show();
            }
        });
        Btnoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wm1 = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wm1.setWifiEnabled(false);
                Toast.makeText(MainActivity.this, " Wifi is disabled", Toast.LENGTH_SHORT).show();
            }
        });
    }
}