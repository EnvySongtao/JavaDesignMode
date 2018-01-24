package com.envy.javadesignmode.structure.decorator;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.structure.composite.Folder;
import com.envy.javadesignmode.structure.composite.ImageFile;
import com.envy.javadesignmode.structure.composite.TextFile;
import com.envy.javadesignmode.structure.composite.VideoFile;

/**
 * author: GuoSongtao on 2017/2/7 15:31
 * email: 157010607@qq.com
 * 装饰者模式，就是不停地给对象添加新功能，
 */

public class DecoratorTestUtils extends TestUtils{

    public DecoratorTestUtils(Activity mAct) {
        super(mAct);
    }

    /**
     * 测试装饰模式
     */
    public void testDecorator(){
        Car carNormal=new Car();
        carNormal.move();

        Log.i("DecoratorTest", "make a water-car:");
        WaterCar waterCar=new WaterCar(carNormal);
        waterCar.move();
        Log.i("DecoratorTest", "make a fly-water-car:(1)");
        FlyCar flyCar=new FlyCar(carNormal);
        WaterCar waterCar1=new WaterCar(flyCar);
        waterCar1.move();
        Log.i("DecoratorTest", "make a water-fly-water-car:(2)");
        WaterCar flyCar1=new WaterCar(new FlyCar(new WaterCar(new Car())));
        flyCar1.move();
    }

}
