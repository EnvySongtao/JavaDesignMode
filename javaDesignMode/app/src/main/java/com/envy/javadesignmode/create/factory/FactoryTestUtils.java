package com.envy.javadesignmode.create.factory;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.create.factory.bean.AbstractEngine;
import com.envy.javadesignmode.create.factory.bean.AudiCarFactoryMethod;
import com.envy.javadesignmode.create.factory.bean.BydCarFactoryMethod;
import com.envy.javadesignmode.create.factory.bean.Car;
import com.envy.javadesignmode.create.factory.bean.LowCarAbstractFractry;

/**
 * author: GuoSongtao on 2017/1/22 10:26
 * email: 157010607@qq.com
 */

public class FactoryTestUtils extends TestUtils {

    public FactoryTestUtils(Activity mAct) {
        super(mAct);
    }


    public void testFactoryMode() {
        Car car1= CarStaticFactory.createCar("奥迪");
        Car car2= CarStaticFactory.createCar("奥迪");
        Car car3= CarStaticFactory.createCar("家里造");

        car1.run();
        car2.run();
        car3.run();
    }

    public void testCarFactory2Mode() {
        Car car1= CarStaticFactory2.createCar();
        Car car2= CarStaticFactory2.createAudiCar();
        Car car3= CarStaticFactory2.createBydCar();

        car1.run();
        car2.run();
        car3.run();
    }

    /**
     * 测试工厂方法模式
     */
    public void testCarFactoryMethodMode() {
        Car car1= new BydCarFactoryMethod().createCar();
        Car car2= new AudiCarFactoryMethod().createCar();

        car1.run();
        car2.run();
    }

    /**
     * 测试抽象工厂模式
     */
    public void testCarAbstractFactory() {
        CarAbstractFractry car=new LowCarAbstractFractry();
        AbstractEngine engine=car.createEngine();
        engine.run();
        engine.start();
    }

}
