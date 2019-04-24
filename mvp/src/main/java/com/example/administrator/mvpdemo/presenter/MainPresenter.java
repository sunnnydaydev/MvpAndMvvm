package com.example.administrator.mvpdemo.presenter;

import com.example.administrator.mvpdemo.model.User;
import com.example.administrator.mvpdemo.view.MainView;


/**
 * Create by SunnyDay on 2019/04/24
 */
public interface MainPresenter extends BasePresenter<MainView> {
    void login(User user);// 用户登录
}
