package com.example.namaste.library;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button login;
    String name;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClick();
    }
    public void onClick(){
        login = (Button)findViewById(R.id.login);
        editText = (EditText)findViewById(R.id.username);
        textView = (TextView)findViewById(R.id.textView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    GetText();
                }
                catch (Exception e){
                    textView.setText("url exception!!!");
                }
            }
        });

    }
    public void GetText() throws UnsupportedEncodingException{
        name = editText.getText().toString();

        String data = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8");
        String text = "done";
        BufferedReader reader = null;

        try{
            URL url = new URL("http://14.140.201.189:8280/opac/myaccount/myAccount.html");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;

            while((line = reader.readLine())!= null){
                sb.append(line + "\n");
            }
            text = sb.toString();

        }
        catch (Exception ex){

        }
        finally {
            try{
                reader.close();
            }
            catch (Exception ex){

            }
        }
        textView.setText(text);

    }
}