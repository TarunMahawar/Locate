package com.tmsnith.locate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.tmsnith.locate.utilities.SharedPref;

public class Register_user extends AppCompatActivity {

    EditText name, email1, rollno;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        name = (EditText) findViewById(R.id.nameReg);
        email1 = (EditText) findViewById(R.id.emailReg1);
        rollno = (EditText) findViewById(R.id.rollnoReg);

        SharedPref s = new SharedPref(this);

        name.setText(s.getName());
        email1.setText(s.getEmail());
    }
}
