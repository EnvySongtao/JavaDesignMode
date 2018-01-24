package com.envy.javadesignmode.structure.decorator;

import android.util.Log;

/**
 * 具体装饰角色(Concrete Decorator)：负责给构件添加增加的功能。
 * author: GuoSongtao on 2017/2/17 11:33
 * email: 157010607@qq.com
 */

public class AICar extends SuperCar {

    private String TAG="FlyCar";

    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        Log.i(TAG, "can move by itself!");
    }
}
