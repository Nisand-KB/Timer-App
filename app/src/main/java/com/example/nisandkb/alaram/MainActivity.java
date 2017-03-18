package com.example.nisandkb.alaram;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void startAlram(View view) {
        et1= (EditText) findViewById(R.id.editText);
        int i = Integer.parseInt(et1.getText().toString());
        Intent i1 = new Intent(this,Main2Activity.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(),234324243,i1,0);
        AlarmManager alarmManager =(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pendingIntent);
        Toast.makeText(this, i, Toast.LENGTH_SHORT).show();
    }

}
