package com.envy.javadesignmode.behavior.observerMode.extendsClass;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * author: GuoSongtao on 2017/1/18 16:25
 * email: 157010607@qq.com
 */

public class ExtendsObserver implements Observer {

    private  String observerName="";

    public ExtendsObserver(String observerName) {
        super();
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.i("MyObserver",observerName+"观察到"+o.toString()+"发生了改变");
    }
}
