package com.example.aaron.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String DEBUG_TAG = "DEBUG";

    TextView tv_Result;
    EditText et_Input;
    Button btn_Calculate;
    Button btn_StartSecActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Result = (TextView) findViewById(R.id.tv_Result);
        et_Input = (EditText) findViewById(R.id.et_InputNum);
        btn_Calculate = (Button) findViewById(R.id.btn_Calculate);
        btn_Calculate.setOnClickListener(calculate_Result);

        btn_StartSecActivity = (Button) findViewById(R.id.btn_StartSecActivity);
        btn_StartSecActivity.setOnClickListener(startSecActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_TAG, "onStart Running");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUG_TAG, "onResume Running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUG_TAG, "onPause Running");
    }

    private OnClickListener calculate_Result = new OnClickListener() {
        @Override
        public void onClick(View view) {
            String s_Input  = et_Input.getText().toString();
            int result = Integer.parseInt(s_Input) * 25;
            tv_Result.setText(Integer.toString(result));
        }
    };


    private OnClickListener startSecActivity = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, secActivity.class);
            intent.putExtra("RESULT", tv_Result.getText().toString());
            startActivity(intent);
        }
    };

}
