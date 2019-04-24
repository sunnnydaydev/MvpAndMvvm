package com.example.administrator.mvpdemo.view;

/**
 * Create by SunnyDay on 2019/04/24
 *
 * 只负责mainActivity中的ui逻辑
 */
public interface MainView extends BaseView {
    void loginSuccess(String msg);//登陆成功

    void loginFailed(String msg);//登录失败
}
