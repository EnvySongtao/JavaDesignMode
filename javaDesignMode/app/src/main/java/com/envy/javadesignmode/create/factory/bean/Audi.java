package com.envy.javadesignmode.create.factory.bean;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/1/22 10:34
 * email: 157010607@qq.com
 */

public class Audi implements Car {
    @Override
    public void run() {
        Log.i("奥迪","开车了！");
    }
}
