package com.example.android.studproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;


public class HelloActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
}
