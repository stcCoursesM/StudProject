package com.example.android.studproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

//    public void clicked(View v){
//        Toast.makeText(this, editText.getText(), Toast.LENGTH_SHORT).show();
//
//    }

    private EditText editTextLogin;
    private EditText editTextPassword;
    private Button buttonLogin;
    private Button buttonRegister;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        editTextLogin = (EditText) findViewById(R.id.Login);
        editTextPassword = (EditText) findViewById(R.id.Password);

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(this);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()){
//                    case R.id.buttonRegister:
//                        startActivity(new Intent(context, RegActivity.class));
//                        break;
//                    case R.id.buttonLogin:
//                        startActivity(new Intent(context, HelloActivity.class));
//                        break;
//                }
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        // handling onClick Events
        switch (view.getId()){
            case R.id.buttonLogin:
                startActivity(new Intent(context, HelloActivity.class));
                break;
            case R.id.buttonRegister:
                startActivity(new Intent(context, RegActivity.class));
                break;
        }
    }
}
