package com.example.to_play;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity{

    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button loginBtn = (Button)findViewById(R.id.loginBtn);
        EditText idEt = (EditText)findViewById(R.id.idEt);
        EditText pwdEt = (EditText) findViewById(R.id.pwdEt);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(LoginActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });


        TextView signText = (TextView)findViewById(R.id.signTxt);
        signText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(LoginActivity.this , SignUpActivity.class);
                startActivity(intent);
            }
        });










    }//onCreate end
}//LoginActivity end
