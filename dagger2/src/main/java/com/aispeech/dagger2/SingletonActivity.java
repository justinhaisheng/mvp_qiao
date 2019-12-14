package com.aispeech.dagger2;

import android.os.Bundle;
import android.util.Log;

import com.aispeech.dagger2.annotation.Sin;
import com.aispeech.dagger2.annotation.Work;
import com.aispeech.dagger2.bean.activity.base.BaseActivity;
import com.aispeech.dagger2.component.DaggerSingletoComponent;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class SingletonActivity extends AppCompatActivity {

    @Inject
    @Sin
    BaseActivity mSingleActivity1;

    @Inject
    @Sin
    BaseActivity mSingleActivity2;

    @Inject
    @Work
    BaseActivity mBaseWorkActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        DaggerSingletoComponent.create().inject(this);
        Log.d("debug", mSingleActivity1.toString());
        Log.d("debug", mSingleActivity2.toString());
        Log.d("debug", mBaseWorkActivity.onCreate());
    }
}
