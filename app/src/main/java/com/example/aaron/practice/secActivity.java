package com.example.aaron.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class secActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent intent = getIntent();
        String str_Result = intent.getStringExtra("RESULT");
        Toast.makeText(secActivity.this, str_Result, Toast.LENGTH_SHORT).show();

    }
}
