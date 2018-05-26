package com.example.rhitik.sellchase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterItems extends AppCompatActivity {
    Button b;
    EditText et1, et2, et3;
    UserSessionManager userSessionManager;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_items);

        et1 = (EditText)findViewById(R.id.item_name);
        et2 = (EditText)findViewById(R.id.room_no);
        et3 = (EditText)findViewById(R.id.date_bought);

        s = et1.getText().toString();

        userSessionManager = new UserSessionManager(this);

        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userSessionManager.saveDetails(s, "", "");
                Toast.makeText(RegisterItems.this, "saved", Toast.LENGTH_SHORT).show();

            }
        });

    }



}
