package com.aispeech.dagger2;

import android.os.Bundle;
import android.widget.TextView;

import com.aispeech.dagger2.bean.People;
import com.aispeech.dagger2.component.DaggerPeopleComponet;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    People mPeople;
    private TextView mDagger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        mDagger = findViewById(R.id.tv_dagger);
        DaggerPeopleComponet.create().inject(this);

        mDagger.setText(mPeople.doWhat());

    }
}
