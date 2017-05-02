package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ManageReservationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_reservations);
    }
    public void toMainMenu(View view){
        Toast.makeText(getApplicationContext(), "Reservation Cancelled", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);

    }
}
