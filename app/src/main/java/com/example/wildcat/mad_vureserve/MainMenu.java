package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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


}
