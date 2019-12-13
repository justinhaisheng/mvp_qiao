package com.aispeech.dagger2;

import android.os.Bundle;
import android.widget.TextView;

import com.aispeech.dagger2.bean.activity.base.BaseActivity;
import com.aispeech.dagger2.bean.activity.base.IActivity;
import com.aispeech.dagger2.component.DaggerActivityComponent;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class DaggerActivity extends AppCompatActivity {

  //  @Inject
    //People mPeople;
    private TextView mDagger;

    @Inject
    BaseActivity mBaseActivity;
    @Inject
    IActivity mIActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        mDagger = findViewById(R.id.tv_dagger);
        //DaggerPeopleComponet.create().inject(this);
        DaggerActivityComponent.create().inject(this);
        mDagger.setText(mBaseActivity.onCreate() + mIActivity.resume());

    }

    //set 方法的注入方式
//    @Inject
//    public void setPeople(People people){
//        this.mPeople = people;
//    }
}
