package com.envy.javadesignmode.structure.decorator;

/**
 * 装饰角色(Decorator)：持有一个构件对象的实例，并定义了抽象构件定义的接口。
 * author: GuoSongtao on 2017/2/17 11:32
 * email: 157010607@qq.com
 */

public class SuperCar implements ICar {
    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
