package com.example.rhitik.workshop1;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    TextView t;
    static int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickB1();
        onClickB2();
    }
    public void onClickB1(){
        b1 = (Button)findViewById(R.id.btoast);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+count, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onClickB2(){
        t = (TextView)findViewById(R.id.textView);
        b2 = (Button)findViewById(R.id.bcount);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                t.setText(String.valueOf(count));
            }
        });

    }
}