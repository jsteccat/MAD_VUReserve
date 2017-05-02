package com.example.wildcat.mad_vureserve;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Toast;

public class CheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
    }

    public void getIpAddress(View view){
        WifiManager wm = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        String ip = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
        StringBuilder iptoast = new StringBuilder();
        iptoast.append("IP Address ");
        iptoast.append(ip);
        iptoast.append(" Confirmed!");


        Toast temp = Toast.makeText(CheckInActivity.this, iptoast, Toast.LENGTH_SHORT);
        temp.show();
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
