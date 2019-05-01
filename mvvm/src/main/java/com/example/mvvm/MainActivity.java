package com.example.mvvm;

import android.databinding.DataBindingUtil;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final User user = new User();
        user.uName.set("Kate");
        binding.setUser(user);

        // 子线程更新UI（必须和实体类中的ObservableField）
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                user.uName.set("Tom");
            }
        }).start();


    }

}
