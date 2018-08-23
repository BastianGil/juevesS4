package com.example.estudiante.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class userformAtivity extends AppCompatActivity {

    private EditText edtUserFormName;
    private EditText getEdtUserFormEmail;
    private EditText getEdtUserFormUsername;

    private Button btn_UserForm_Finish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userform_ativity);


        //Intent solicitud = getIntent();


        edtUserFormName= findViewById(R.id.edt_userform_name);
        getEdtUserFormEmail= findViewById(R.id.edt_userform_email);
        getEdtUserFormUsername= findViewById(R.id.edt_userform_username);

        btn_UserForm_Finish = findViewById(R.id.btn_userform_finish);

    }
}
