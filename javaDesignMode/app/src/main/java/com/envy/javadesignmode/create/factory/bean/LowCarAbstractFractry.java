package com.envy.javadesignmode.create.factory.bean;

import com.envy.javadesignmode.create.factory.CarAbstractFractry;

/**
 * author: GuoSongtao on 2017/1/22 17:20
 * email: 157010607@qq.com
 */

public class LowCarAbstractFractry implements CarAbstractFractry {

    @Override
    public AbstractEngine createEngine() {
        return new LowEngine();
    }

    @Override
    public AbstractSeat createSeat() {
        return new LowSeat();
    }

    @Override
    public AbstractTyre createTyre() {
        return new LowTyre();
    }
}
