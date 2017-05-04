package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.ParseException;
import java.util.Date;

public class FindRoomActivity extends AppCompatActivity {

    EditText editDate, editTimeStart, editTimeEnd;
    String date;
    String startTime;
    String endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_room);

    }

    public void toFindRoom2(View view){

        editDate = (EditText) findViewById(R.id.editDate);
        date = editDate.getText().toString();
        editTimeStart = (EditText) findViewById(R.id.editTimeStart);
        startTime = editTimeStart.getText().toString();
        editTimeEnd = (EditText) findViewById(R.id.editTimeEnd);
        endTime = editTimeEnd.getText().toString();

        //Toast.makeText(this, date, Toast.LENGTH_SHORT).show();



        Intent intent = new Intent(this, FindRoomActivity2.class);
   //     intent.putExtra("date",date);
   //     intent.putExtra("start_time",startTime);
        startActivity(intent);
    }
}
