package com.tmsnith.locate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.tmsnith.locate.utilities.SharedPref;

public class Register_user extends AppCompatActivity implements View.OnClickListener {

    EditText name, email1, rollno;
    TextView terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        name = (EditText) findViewById(R.id.nameReg);
        email1 = (EditText) findViewById(R.id.emailReg1);
        rollno = (EditText) findViewById(R.id.rollnoReg);

        terms = (TextView)findViewById(R.id.terms);

        SharedPref s = new SharedPref(this);

        name.setText(s.getName());
        email1.setText(s.getEmail());

        terms.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == terms)
        {

        }
    }
}
