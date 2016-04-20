package com.estudos.mvasconcelos.activitynavigation;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Context getContext (){return this;}



}
