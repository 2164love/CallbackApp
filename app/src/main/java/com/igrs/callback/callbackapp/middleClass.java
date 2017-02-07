package com.igrs.callback.callbackapp;

import android.view.View;

/**
 * Created by xyt on 2017/1/9.
 */

public  class middleClass implements  ToastInterface{
    @Override
    public void showError(String error) {
       System.out.println("被点击了");

    }

    @Override
    public void onClickLister(View view) {

    }

}
