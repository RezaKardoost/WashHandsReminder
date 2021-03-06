package com.yasinhajiloo.washhandsreminder.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import com.yasinhajiloo.washhandsreminder.AlarmReceiver;

public class MyAlarmManager {
    public static AlarmManager getAlarmManager(Context context){
        return (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
    }

    public static PendingIntent getPendingIntent(Context context , int id , int flag ){
        Intent intent = new Intent(context , AlarmReceiver.class);
         return PendingIntent.getBroadcast(context , id , intent , flag );
    }
}
