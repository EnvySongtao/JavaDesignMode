package com.envy.javadesignmode.create.factory.bean;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/1/22 14:35
 * email: 157010607@qq.com
 */

public  class Byd implements Car {
    @Override
    public void run() {
        Log.i("比亚迪", "开车了！");
    }
}