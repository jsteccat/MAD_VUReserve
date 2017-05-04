package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.wildcat.mad_vureserve.R.id.editPassText;

public class SignUpActivity extends AppCompatActivity {

    EditText name, username, email, password, confirmpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = (EditText)findViewById(R.id.editUsername);
        email = (EditText)findViewById(R.id.editEmail);
        name = (EditText)findViewById(R.id.editName);
        password = (EditText)findViewById(R.id.editPassword);
        confirmpass = (EditText)findViewById(R.id.editConfirmPass);

    }

    public void onRegister(View v){

            //String password_str, confirmpass_str;

            //if(!password_str.equals(confirmpass_str)){
            //    Toast pass = Toast.makeText(SignUpActivity.this , " Passwords Need to Match" , Toast.LENGTH_LONG);
            //    pass.show();
            //}
           // else{

                String name_str = name.getText().toString();
                String username_str = username.getText().toString();
                String email_str = email.getText().toString();
                String password_str = password.getText().toString();

                String type = "resister";
                BackgroundWorker backgroundWorker = new BackgroundWorker(this);
                backgroundWorker.execute(type, name_str, username_str, email_str, password_str);

                //Intent i = new Intent(SignUpActivity.this, MainActivity.class);
                //i.putExtra("name", string);
                //startActivity(i);

                //Toast pass = Toast.makeText(SignUpActivity.this , " Passwords Match ;)" , Toast.LENGTH_LONG);
                //pass.show();
                //

            }




}
