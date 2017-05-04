package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class ManageReservationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_reservations);

        final Button button = (Button) findViewById(R.id.cancel2);
        final TextView roomRes = (TextView) findViewById(R.id.textView16);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                roomRes.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(), "Thank you. Your reservation has been canceled", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void backToMainMenu(View view){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);

    }

}
