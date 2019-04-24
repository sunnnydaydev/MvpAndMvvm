package com.example.administrator.mvpdemo.presenter;

import com.example.administrator.mvpdemo.model.User;
import com.example.administrator.mvpdemo.view.BaseView;

/**
 * Create by SunnyDay on 2019/04/24
 */
public interface BasePresenter {
    /**
     * 绑定view
     * 由于presenter 和view之间交互，所以要二者建立联系（依赖关系，持有引用）
     */
    void attachView(BaseView baseView);

    void detachView();// 解绑view

    void login(User user);// 用户登录
}
