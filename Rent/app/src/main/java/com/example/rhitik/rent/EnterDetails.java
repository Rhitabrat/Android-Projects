package com.example.rhitik.rent;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class EnterDetails extends AppCompatActivity {
    private Calendar calendar;
    private int year, month, day;
    private TextView dateView;

    EditText et1,et2,et3;
    Button b2;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Topic = "nameKey";
    public static final String Expense = "phoneKey";
    public static final String Location = "emailKey";

   public static SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
        et1=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText3);

        dateView = (TextView)findViewById(R.id.textView);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        showDate(year, month+1, day);

        saveOnClick();
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
         if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
                // arg1 = year
                // arg2 = month
                // arg3 = day
                showDate(arg1, arg2+1, arg3);
            }
    };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/").append(month).append("/").append(year));
    }

    private void saveOnClick() {
        b2 = (Button)findViewById(R.id.button2);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String topic = et1.getText().toString();
                String expense = et2.getText().toString();
                String location = et3.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Topic,topic);
                editor.putString(Expense, expense);
                editor.putString(Location, location);
                editor.commit();

                Toast.makeText(EnterDetails.this,"Saved",Toast.LENGTH_SHORT).show();

            }
        });
    }


}
