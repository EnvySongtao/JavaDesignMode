package com.envy.javadesignmode.create.factory;

import com.envy.javadesignmode.create.factory.bean.Car;

/**
 * author: GuoSongtao on 2017/1/22 15:08
 * email: 157010607@qq.com
 *  优点：扩展时，添加新类型时，不用在修改旧的类
 *  缺点：每一个类都需要一个工厂方法类，会生成很多工厂方法类
 */

public interface CarFactoryMethod {
    Car createCar();
}
