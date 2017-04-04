package com.jimmy.romyim.ddms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.LIFT_TAG, "Create");
        this.myButton=(Button)findViewById(R.id.logButton);
        this.myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(MainActivity.LIFT_TAG, "Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(MainActivity.LIFT_TAG, "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(MainActivity.LIFT_TAG, "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(MainActivity.LIFT_TAG, "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(MainActivity.LIFT_TAG, "Stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(MainActivity.LIFT_TAG, "Start");
    }

    Button myButton;
    static final String LIFT_TAG = "MainActivity";
}
