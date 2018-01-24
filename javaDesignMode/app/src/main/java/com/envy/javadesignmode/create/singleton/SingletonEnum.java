package com.envy.javadesignmode.create.singleton;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/1/19 16:57
 * email: 157010607@qq.com
 * 占用资源少，不需要延迟加载时 枚举式加载效果好于饿汉式
 */

public enum SingletonEnum {

    INSTANCE;
//    private String name;
    public static void test(){
        Log.i("SingletonEnum",INSTANCE.toString());
    }
}
