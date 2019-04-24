package com.example.administrator.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mvpdemo.R;

public class OtherActivity extends AppCompatActivity implements OtherView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showProgress(int progress) {

    }
}
