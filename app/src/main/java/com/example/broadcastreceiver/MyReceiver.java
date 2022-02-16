package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    public static final String TAG = "MyReceiver";


    @Override
    public void onReceive(Context context, Intent intent) {

        //String actionString = intent.getAction();
        //Toast.makeText(context, actionString, Toast.LENGTH_LONG).show();

       // boolean isOn = intent.getBooleanExtra("state",false);
       // Log.d(TAG,"Airplane mode is on: " + isOn);
    }
}