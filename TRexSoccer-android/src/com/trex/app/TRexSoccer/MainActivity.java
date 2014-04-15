package com.trex.app.TRexSoccer;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.os.StrictMode;
import android.util.Log;
import android.widget.Toast;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.List;
import java.util.Random;


public class MainActivity extends AndroidApplication {

    private String DATA_URL="http://1-dot-avian-outrider-546.appspot.com/resource/getSeatCords/";
    @Override
    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("Soccer","LO");
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        List<SensorData> data = generate.test();

        int Max = 1145, Min = 0;
        int rand =Min + (int)(Math.random() * ((Max - Min) + 1));
        String []pair = data.get(rand).values.get(0).split("_");

        String x = pair[0];
        String y = pair[1];

        Log.d("Soccer",DATA_URL + message+"/"+x+"/"+y);
        String output = new RequestTask().doInBackground(DATA_URL + message+"/"+x+"/"+y);
        Log.d("Soccer","$$"+output+"$$");
        Toast.makeText(getApplicationContext(),output,Toast.LENGTH_LONG).show();

        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();

        cfg.useAccelerometer = false;
        cfg.useCompass = false;

        initialize(new TRexSoccerSeatingApp(output), cfg);
    }
}