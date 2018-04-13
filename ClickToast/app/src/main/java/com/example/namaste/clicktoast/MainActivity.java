package com.example.namaste.clicktoast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClick();
    }
    public void onClick(){
        b = (Button)findViewById(R.id.button);
        t = (TextView)findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Hello!!!\nRhitabrat Pokharel\n1/16/FET/BCS/1/100");
            }
        });
    }
}