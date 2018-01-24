package com.envy.javadesignmode.create.factory;

import android.util.Log;

import com.envy.javadesignmode.create.factory.bean.Audi;
import com.envy.javadesignmode.create.factory.bean.Byd;
import com.envy.javadesignmode.create.factory.bean.Car;

/**
 * author: GuoSongtao on 2017/1/22 14:37
 * email: 157010607@qq.com
 */

public class CarStaticFactory2 {
    public static Car createCar() {
        return new Car() {
            @Override
            public void run() {
                Log.i("山寨车", "开车了!");
            }
        };
    }

    public static Car createAudiCar() {
        return new Audi();
    }
    public static Car createBydCar() {
        return new Byd();
    }
}
