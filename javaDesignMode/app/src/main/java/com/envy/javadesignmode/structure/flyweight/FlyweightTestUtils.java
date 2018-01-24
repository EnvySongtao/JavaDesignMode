package com.envy.javadesignmode.structure.flyweight;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.structure.facade.User;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/04/26/2468499.html
 * author: GuoSongtao on 2017/2/7 15:31
 * email: 157010607@qq.com
 */

public class FlyweightTestUtils extends TestUtils{


    public FlyweightTestUtils(Activity mAct) {
        super(mAct);
    }


    /**
     * 测试外观模式
     */
    public void testFlyweight(){

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }

}
