package com.niqiu.dagger.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.niqiu.dagger.R;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class MainActivity extends AppCompatActivity {

    @Inject
    Boss boss;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity", "---onCreate()---" + this);
        ObjectGraph.create(MainModule.class).inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("我的boss：" + boss.getName());
    }
}
