package com.example.rhitik.sellchase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClick1();
        onClick2();
    }
    public void onClick1(){
        b1 = (Button)findViewById(R.id.bsell);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SellCategory.class);
                startActivity(i);
            }
        });
    }
    public void onClick2(){
        b2 = (Button)findViewById(R.id.bpurchase);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PurchaseCategory.class);
                startActivity(i);
            }
        });
    }

}
