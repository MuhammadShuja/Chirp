package com.chirpmessenger.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chirpmessenger.XMPP.XMPP;

public class SplashActivity extends AppCompatActivity {

    private static String TAG = "Splash";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean auth = prefs.getBoolean(XMPP.AUTH, false);

        if(auth){
            Log.d(TAG, "--------------------- old user");

            XMPP.username = prefs.getString(XMPP.USERNAME, "");
            XMPP.password = prefs.getString(XMPP.PASSWORD, "");

            XMPP.getInstance(SplashActivity.this).init();
        }
        else{
            Log.d(TAG, "--------------------- new user");
            startActivity(new Intent(SplashActivity.this, StartActivity.class));
            finish();
        }
    }
}