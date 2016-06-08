package com.example.mirzaaqibbeg.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.net.ssl.ManagerFactoryParameters;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                starAlert();

            }
        });






    }

    private void starAlert() {
        EditText text=(EditText)findViewById(R.id.time);
        int i=Integer.parseInt(text.getText().toString());
        Intent intent=new Intent(this, MyBroadcastReciever.class );
        PendingIntent pendingIntent=PendingIntent.getBroadcast(this.getApplicationContext(),234324243,intent,0);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pendingIntent);
        Toast.makeText(this,"Alarsetin"+i+"Seconds",Toast.LENGTH_LONG).show();


    }
}
