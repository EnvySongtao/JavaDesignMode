package com.envy.javadesignmode.create.factory;

import com.envy.javadesignmode.create.factory.bean.AbstractEngine;
import com.envy.javadesignmode.create.factory.bean.AbstractSeat;
import com.envy.javadesignmode.create.factory.bean.AbstractTyre;

/**
 * author: GuoSongtao on 2017/1/22 17:15
 * email: 157010607@qq.com
 * 抽象工厂，是简单工厂的组合形式（个人认为）
 */
public interface CarAbstractFractry {
    AbstractEngine createEngine();

    AbstractSeat createSeat();

    AbstractTyre createTyre();
}
