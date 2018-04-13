package com.example.rhitik.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
            return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(this, "I want to eat an Apple", Toast.LENGTH_SHORT).show();
            case R.id.item2:
                Toast.makeText(this, "I want to eat an Orange", Toast.LENGTH_SHORT).show();
            case R.id.item3:
                Toast.makeText(this, "I want to eat a Mango", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
