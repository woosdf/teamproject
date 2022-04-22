package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // layout 설정
        setContentView(R.layout.activity_login);

        //회원가입 listener
        TextView register_tv = (TextView) findViewById(R.id.register_tv);
        register_tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        //login listener
        Button btnLogin = (Button) findViewById(R.id.cirLoginButton);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        //id/pw 찾기 listener
        TextView finder_tv = (TextView) findViewById(R.id.findertv);
        finder_tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, idfinderActivity.class);
                startActivity(intent);
            }
        });



    }
}
