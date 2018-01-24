package com.envy.javadesignmode.structure.decorator;

import android.util.Log;

/**
 * 具体构件角色(Concrete Component)：这是被装饰者，定义一个将要被装饰增加功能的类。
 * author: GuoSongtao on 2017/2/17 11:29
 * email: 157010607@qq.com
 */

public class Car implements ICar {
    private String TAG="car";

    @Override
    public void move() {
        Log.i(TAG, "can move on land!");
    }
}
