package com.igrs.callback.abstractFactoryMode;

/**
 * Created by xyt on 2017/1/9.
 */

public class TextSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new TextSender();
    }
}
