package com.example.namaste.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] friuts = {"apple", "banana", "mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_item);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, friuts);
        listView.setAdapter(adapter);

        Toast.makeText(getApplicationContext(),"list view", Toast.LENGTH_SHORT).show();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Position is "+(i+1), Toast.LENGTH_LONG).show();
            }
        });
    }

}
