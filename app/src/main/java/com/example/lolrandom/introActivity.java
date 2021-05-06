package com.example.lolrandom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;

public class introActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_intro);
        handler.sendEmptyMessageDelayed(0,1500);
    }

    Handler handler= new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            Intent intent= new Intent(introActivity.this,MainActivity.class);
            startActivity(intent);
        }
    };

    public void letsgo(View view) {
        Intent intent= new Intent(introActivity.this,MainActivity.class);
        startActivity(intent);
    }
}