package com.igrs.callback.callbackapp;

/**
 * Created by xyt on 2017/1/5.
 */
public class singleInstance {
    private static singleInstance ourInstance = new singleInstance();

    public static singleInstance getInstance() {
        return ourInstance;
    }

    private singleInstance() {
    }
}
