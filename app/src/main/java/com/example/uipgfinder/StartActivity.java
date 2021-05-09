package com.example.uipgfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class StartActivity extends AppCompatActivity {

    private Button loginActivityUser,regActivityUser,loginActivityOwner,regActivityOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        loginActivityUser = findViewById(R.id.login_btn_start);
        regActivityUser = findViewById(R.id.reg_btn_start);
        loginActivityOwner = findViewById(R.id.login_btn_start_owner);
        regActivityOwner = findViewById(R.id.reg_btn_start_owner);



        loginActivityOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(StartActivity.this,PgOwnerLogin.class);
               startActivity(intent);
            }
        });

        regActivityOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,PgOwnerReg.class);
                startActivity(intent);
            }
        });

        loginActivityUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        regActivityUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}