package com.example.stopwatch;



import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button start;
    Button stop;
    Button reset;
    Chronometer timer;
    boolean isRunning;
    long stopVariable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.startButton);
        stop = findViewById(R.id.stopButton);
        reset = findViewById(R.id.resetButton);
        timer = findViewById(R.id.chronometer);

    }

    public void startChronometer(View view){
        if (isRunning == false){
            timer.setBase(SystemClock.elapsedRealtime() - stopVariable);
            timer.start();
            isRunning = true;
        }
    }

    public void stopChronometer(View view){
        if (isRunning == true){

            timer.stop();
            stopVariable = SystemClock.elapsedRealtime() - timer.getBase();
            isRunning = false;
        }
    }

    public void resetChronometer(View view){
        timer.setBase(SystemClock.elapsedRealtime());
        stopVariable = 0;

    }
}