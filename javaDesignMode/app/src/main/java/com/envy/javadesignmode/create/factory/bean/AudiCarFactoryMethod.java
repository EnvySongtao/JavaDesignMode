package com.envy.javadesignmode.create.factory.bean;

import com.envy.javadesignmode.create.factory.CarFactoryMethod;

/**
 * author: GuoSongtao on 2017/1/22 15:12
 * email: 157010607@qq.com
 */

public class AudiCarFactoryMethod implements CarFactoryMethod{
    @Override
    public  Car createCar() {
        return new Audi();
    }
}
