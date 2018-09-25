package com.example.joego.alarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends Activity {

    private static final long PeriodInMilliSeconds = 2 * 1000;

    AlarmManager mAM;

    AlarmReceiver alarmReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alarmReceiver = new AlarmReceiver();

        registerReceiver(alarmReceiver, new IntentFilter("com.example.joego.alarm"));

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0,  new Intent("com.example.joego.alarm"), PendingIntent.FLAG_UPDATE_CURRENT);

        mAM = (AlarmManager)(this.getSystemService( Context.ALARM_SERVICE ));
        mAM.setRepeating(AlarmManager.ELAPSED_REALTIME,  SystemClock.elapsedRealtime() + PeriodInMilliSeconds, PeriodInMilliSeconds, pendingIntent);

    }
}
