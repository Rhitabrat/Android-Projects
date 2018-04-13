package com.example.namaste.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClick();
     }
     public void onClick(){
         btn = (Button)findViewById(R.id.login);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent("com.example.namaste.login.SecondPage");
                 startActivity(intent);
             }
         });
     }

}

