package com.example.xiao.sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.WallpaperManager;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startService = (Button) findViewById(R.id.button);
        Button stopService = (Button) findViewById(R.id.button2);


        startService.setOnClickListener(new Button.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this, SmsService.class);
                startService(startIntent);
            }
        });

        stopService.setOnClickListener(new Button.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub
                Intent stopIntent = new Intent(MainActivity.this, SmsService.class);
                stopService(stopIntent);

            }

        });

    }

}
