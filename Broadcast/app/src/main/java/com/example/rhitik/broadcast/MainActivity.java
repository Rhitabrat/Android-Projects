package com.example.rhitik.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                broadcastIntent(v);
            }
        });
    }
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.example.rhitik.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
