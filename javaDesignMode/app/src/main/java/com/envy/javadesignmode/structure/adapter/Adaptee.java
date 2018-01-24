package com.envy.javadesignmode.structure.adapter;

import android.util.Log;

/**
 * 需要适配的类（Adaptee）：需要适配的类或适配者类。
 * 适配器对象类
 * author: GuoSongtao on 2017/2/7 13:47
 * email: 157010607@qq.com
 */

public class Adaptee {
    private static final String TAG="Adpatee";

    public void specialRequest(){
        Log.i(TAG, "this is a special request!");
    }
}
