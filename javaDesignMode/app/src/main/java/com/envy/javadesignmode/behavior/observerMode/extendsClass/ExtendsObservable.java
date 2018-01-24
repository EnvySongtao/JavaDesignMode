package com.envy.javadesignmode.behavior.observerMode.extendsClass;

import java.util.Observable;

/**
 * author: GuoSongtao on 2017/1/18 16:22
 * email: 157010607@qq.com
 */

public class ExtendsObservable extends Observable {

    @Override
    public synchronized boolean hasChanged() {
        return true;//
    }
}
