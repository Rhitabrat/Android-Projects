package com.example.rhitik.sellchase;


import android.content.Context;
import android.content.SharedPreferences;

public class UserSessionManager {
    SharedPreferences sharedPreferences;
    Context context;

    UserSessionManager(Context context){
        this.context = context;
    }

    public void saveDetails(String itemName, String roomNo, String dateBought){
        sharedPreferences = context.getSharedPreferences("sellinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("Item", itemName);
        editor.putString("room", roomNo);
        editor.putString("date", dateBought);

        editor.commit();
    }
    public String displayName(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("sellinfo", context.MODE_PRIVATE);
        return sharedPreferences.getString("Item", "");
    }
    public String displayRoom(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("sellinfo", context.MODE_PRIVATE);
        return sharedPreferences.getString("room", "");
    }
    public String displayDate(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("sellinfo", context.MODE_PRIVATE);
        return sharedPreferences.getString("date", "");
    }
    public void clearSharedPreference(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences("sellinfo", Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.clear();
        editor.commit();
    }
}