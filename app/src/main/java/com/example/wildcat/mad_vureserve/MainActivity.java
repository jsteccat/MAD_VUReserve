package com.example.wildcat.mad_vureserve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMainMenu(View view){
        //Check Login Data
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);

    }
}
