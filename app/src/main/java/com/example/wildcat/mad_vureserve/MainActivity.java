package com.example.wildcat.mad_vureserve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Display;


public class MainActivity extends AppCompatActivity {

    EditText editUserText;
    EditText editPassText;
    Button button;
    DatabaseHelper loginHelper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUserText = (EditText)findViewById(R.id.editUserText);
        editPassText = (EditText)findViewById(R.id.editPassText);
    }


   /* public void toLogin(View v) {
        if (v.getId() == R.id.button) {
            EditText username = (EditText) findViewById(R.id.editUserText);
            String userstr = username.getText().toString();
            EditText password = (EditText) findViewById(R.id.editPassText);
            String passstr = password.getText().toString();

            String passcheck = loginHelper.searchPass(userstr);
            if (passstr.equals(passcheck)) {
                Intent i = new Intent(MainActivity.this, MainMenu.class);
                //i.putExtra("name", string);
                startActivity(i);
            } else {
                Toast temp = Toast.makeText(MainActivity.this, "Incorrect Username or Password!", Toast.LENGTH_SHORT);
                temp.show();
            }
            //Intent i = new Intent(MainActivity.this, MainMenu.class);
            //i.putExtra("name", string);
            //startActivity(i);
        }
    } */

    public void toLogin(View v) {
        String username = editUserText.getText().toString();
        String password = editPassText.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);


    }

    /*public void toSignUp(View v){
        if (v.getId() == R.id.buttonSignUp) {
            Intent i = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(i);
        }
    }*/
}

