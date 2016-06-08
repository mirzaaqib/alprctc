package com.example.mirzaaqibbeg.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.widget.Toast;

import java.net.ContentHandler;
import java.util.Scanner;

import static android.widget.Toast.*;


/**
 * Created by Mirzaaqibbeg on 03-02-2016.
 */
public abstract class MyBroadcastReciever extends BroadcastReceiver{
    MediaPlayer mp;
    public void onRecieve (Context context ,Intent intent){
        mp=MediaPlayer.create(context,R.raw.alrm);
        mp.start();
        makeText(context, "Alarm..", LENGTH_LONG).show();
    }



}
