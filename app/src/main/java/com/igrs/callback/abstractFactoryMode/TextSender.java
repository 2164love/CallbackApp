package com.igrs.callback.abstractFactoryMode;

import android.util.Log;

/**
 * Created by xyt on 2017/1/9.
 */

public class TextSender implements Sender {
    @Override
    public void send() {
        Log.i("info","发送一个文本文件");
    }
}
