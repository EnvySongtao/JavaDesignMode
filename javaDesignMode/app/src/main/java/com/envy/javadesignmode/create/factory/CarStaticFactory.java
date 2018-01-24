package com.envy.javadesignmode.create.factory;

import android.util.Log;

import com.envy.javadesignmode.create.factory.bean.Audi;
import com.envy.javadesignmode.create.factory.bean.Car;

/**
 * author: GuoSongtao on 2017/1/22 14:37
 * email: 157010607@qq.com
 *
 * 简单工厂模式 又被称为 静态工厂模式
 */

public class CarStaticFactory {
    public static Car createCar(String carType){
        if("奥迪".equals(carType)){
            return new Audi();
        }else if("比亚迪".equals(carType)){
            return new Audi();
        }else{
            return new Car(){
                @Override
                public void run() {
                    Log.i("山寨车","开车了!");
                }
            };
        }
    }
}
