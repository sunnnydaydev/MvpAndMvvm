package com.example.administrator.mvpdemo.presenter;



/**
 * Create by SunnyDay on 2019/04/24
 */
public interface BasePresenter<T> {
    /**
     * 绑定view  解绑view 是通用功能
     *
     */
    void attachView(T t);

    void detachView();// 解绑view

}
