package com.example.wildcat.mad_vureserve;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    public void toFindRoom(View view){
        Intent intent = new Intent(this, FindRoomActivity.class);
        startActivity(intent);

    }

    public void toManageReservations(View view){
        Intent intent = new Intent(this, ManageReservationsActivity.class);
        startActivity(intent);

    }

    public void toReportProblem(View view){
        Intent intent = new Intent(this, ReportProblemActivity.class);
        startActivity(intent);

    }

    public void toCheckInActivity(View view){
        Intent intent = new Intent(this, CheckInActivity.class);
        startActivity(intent);

    }



}
