package com.jimmy.romyim.ddms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.v(TestActivity.LIFT_TAG, "Create");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TestActivity.LIFT_TAG, "Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TestActivity.LIFT_TAG, "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TestActivity.LIFT_TAG, "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TestActivity.LIFT_TAG, "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TestActivity.LIFT_TAG, "Stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TestActivity.LIFT_TAG, "Start");
    }

    static final String LIFT_TAG = "TestActivity";
}
