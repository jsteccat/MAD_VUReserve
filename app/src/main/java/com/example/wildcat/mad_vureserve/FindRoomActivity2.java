package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class FindRoomActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_room2);
        Bundle bundle = getIntent().getExtras();
        String date = bundle.getString("date");
        String timeStart = bundle.getString("start_time");
        String timeEnd = bundle.getString("end_time");
        //Toast.makeText(this, date, Toast.LENGTH_SHORT).show();

        String type = "find_slots";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, date, timeStart, timeEnd);

    }


    public void toThankYou(View view) {
        RadioButton radioButton;
        radioButton = (RadioButton) findViewById(R.id.radioButton);

        if(radioButton.isChecked()){
            Intent intent = new Intent(this, ThankYouActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "Please Select a Reservation", Toast.LENGTH_SHORT).show();
        }

    }
}
