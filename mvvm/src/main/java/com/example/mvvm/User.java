package com.example.mvvm;

import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

/**
 * Create by SunnyDay on 2019/04/26
 */
public class User {
    //  public String uName;
    public ObservableField<String> uName = new ObservableField<>();

    public void onClickName(View view) {
        Log.i(TAG, uName.get());
    }

}
