package com.example.administrator.mvpdemo.presenter;

import android.text.TextUtils;


import com.example.administrator.mvpdemo.model.User;

import com.example.administrator.mvpdemo.view.MainView;

/**
 * Create by SunnyDay on 2019/04/24
 */
public class MainPresenterImpl implements MainPresenter {
    private MainView mainView;

    @Override
    public void attachView(MainView mainView) {
        this.mainView = mainView;
    }



    @Override
    public void detachView() {
        mainView = null;
    }

    /**
     * view的业务逻辑处理   登录成功弹 成功的吐司，登录失败弹失败吐司
     */
    @Override
    public void login(User user) {
        if (!TextUtils.isEmpty(user.getNumber()) && !TextUtils.isEmpty(user.getPwd())) {
            if (user.getNumber().equals("123") && user.getPwd().equals("123")) {
                mainView.loginSuccess("登录成功！");
            } else {
                mainView.loginFailed("账号或者密码错误，登录失败！");
            }

        } else {
            mainView.loginFailed("账号或者密码错误，登录失败！");
        }
    }
}
