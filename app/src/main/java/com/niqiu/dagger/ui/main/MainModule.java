package com.niqiu.dagger.ui.main;

import android.util.Log;

import dagger.Module;

/**
 * Created by 毅东 on 2015/11/16.
 */
@Module(injects = MainActivity.class)
public class MainModule {
    public MainModule(MainActivity activity) {
        Log.d("MainModule", "---MainModule()---" + activity);
    }

    public MainModule() {
        Log.d("MainModule","---MainModule()---");
    }

}
