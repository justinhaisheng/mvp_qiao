package com.aispeech.dagger2;

import android.os.Bundle;
import android.util.Log;

import com.aispeech.dagger2.bean.activity.StudentActivity;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class StuActivity extends AppCompatActivity {

    private static final String TAG = StuActivity.class.getSimpleName();
    @Inject
    StudentActivity mStudentActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu);
        MyApp.getApp().getComponent().student().inject(this);
        Log.d(TAG,""+mStudentActivity.onCreate());
    }
}
