package com.example.to_play;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        Button loginBtn = (Button) findViewById(R.id.goBtn);
        Button signBtn = (Button) findViewById(R.id.signBtn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(TitleActivity.this , LoginActivity.class);
                startActivity(intent);
            }
        });//loginBtn end


        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(TitleActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });// signBtn end


    }//onCreate end

}//titleActivity end
