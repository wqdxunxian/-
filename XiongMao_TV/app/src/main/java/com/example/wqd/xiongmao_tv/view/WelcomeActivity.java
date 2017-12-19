package com.example.wqd.xiongmao_tv.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wqd.xiongmao_tv.R;
import com.example.wqd.xiongmao_tv.base.BaseActivity;
import com.example.wqd.xiongmao_tv.module.home.HomePageActivity;

public class WelcomeActivity extends BaseActivity {

    private Handler handler=new Handler();
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(WelcomeActivity.this,HomePageActivity.class));
            finish();
        }
    };

    @Override
    protected int getLayout() {
        return R.layout.activity_welcome;

    }

    @Override
    protected void init() {

        handler.postDelayed(runnable,3000);

    }

    @Override
    protected void initData() {

    }
}
