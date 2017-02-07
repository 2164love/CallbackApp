package com.igrs.callback.abstractFactoryMode;

/**
 * Created by xyt on 2017/1/9.
 */

public class MailSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();

    }
}
