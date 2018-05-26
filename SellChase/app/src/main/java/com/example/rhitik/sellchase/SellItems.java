package com.example.rhitik.sellchase;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SellItems extends AppCompatActivity {
    UserSessionManager sessionManager;
    TextView tw;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_items);

        sessionManager = new UserSessionManager(this);

        tw = (TextView)findViewById(R.id.textView);

        s = sessionManager.displayName();
        tw.setText(s);

    }




}
