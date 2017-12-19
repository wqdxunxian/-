package com.example.wqd.xiongmao_tv.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wqd on 2017/11/1.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        init();
        initData();
    }

    protected abstract int getLayout();

    protected abstract void init();

    protected abstract void initData();
}
