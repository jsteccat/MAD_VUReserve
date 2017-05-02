package com.example.wildcat.mad_vureserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onSignUpClick(View v){
        if(v.getId()== R.id.buttonAddUser){
            EditText username = (EditText)findViewById(R.id.editUsername);
            EditText email = (EditText)findViewById(R.id.editEmail);
            EditText name = (EditText)findViewById(R.id.editName);
            EditText password = (EditText)findViewById(R.id.editPassword);
            EditText confirmpass = (EditText)findViewById(R.id.editConfirmPass);

            String usernamestr = username.getText().toString();
            String emailstr = email.getText().toString();
            String namestr = name.getText().toString();
            String passwordstr = password.getText().toString();
            String confirmpassstr = confirmpass.getText().toString();

            if(!passwordstr.equals(confirmpassstr)){
                Toast pass = Toast.makeText(SignUpActivity.this , " Passwords Need to Match" , Toast.LENGTH_LONG);
                pass.show();
            }
            else{
                User u = new User();
                u.setUsername(usernamestr);
                u.setEmail(emailstr);
                u.setName(namestr);
                u.setPassword(passwordstr);

                helper.insertUser(u);
                Intent i = new Intent(SignUpActivity.this, MainActivity.class);
                //i.putExtra("name", string);
                startActivity(i);

                //Toast pass = Toast.makeText(SignUpActivity.this , " Passwords Match ;)" , Toast.LENGTH_LONG);
                //pass.show();
                //

            }


        }
    }
}
