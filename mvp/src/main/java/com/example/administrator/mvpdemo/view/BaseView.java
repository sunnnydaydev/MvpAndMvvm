package com.example.administrator.mvpdemo.view;

/**
 * Create by SunnyDay on 2019/04/24
 * view相关的逻辑：登录弹吐司、登陆成功、登录失败、
 */
public interface BaseView {
    void showToast(String msg);//登录弹吐司

    void loginSuccess(String msg);//登陆成功

    void loginFailed(String msg);//登录失败
}
