package com.example.rhitik.rent;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ShowDetails extends AppCompatActivity {
    TextView t;
    SharedPreferences p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        t = (TextView)findViewById(R.id.textView);

        p = PreferenceManager.getDefaultSharedPreferences();
        String s = p.getString(, "sarthak");

        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();


    }
}