package com.example.wqd.xiongmao_tv.base;

/**
 * Created by Wqd on 2017/11/1.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}