package com.example.alarmdemofirst;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.TextView;
import android.widget.Toast;

public class MyBroadcastingReceiver extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context, R.raw.sample);
        mp.start();
        Toast.makeText(context, "Alarm ..", Toast.LENGTH_SHORT).show();

    }
}
