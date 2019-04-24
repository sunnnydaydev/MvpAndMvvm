package com.example.administrator.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.model.User;
import com.example.administrator.mvpdemo.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements BaseView {
    MainPresenterImpl mainPresenter;
    private EditText number;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.administrator.mvpdemo.R.layout.activity_main);
        initView();
        mainPresenter = new MainPresenterImpl();
        mainPresenter.attachView(this);
    }

    /**
     * 初始化view
     */
    private void initView() {
        number = findViewById(R.id.user_number);
        pwd = findViewById(R.id.user_pwd);
    }

    /**
     * 按钮的点击事件
     */
    public void doLogin(View view) {
        String num = number.getText().toString();
        String passWord = pwd.getText().toString();
        User user = new User(num, passWord);
        mainPresenter.login(user);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(String msg) {
        showToast(msg);
    }

    @Override
    public void loginFailed(String msg) {
        showToast(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }
}
