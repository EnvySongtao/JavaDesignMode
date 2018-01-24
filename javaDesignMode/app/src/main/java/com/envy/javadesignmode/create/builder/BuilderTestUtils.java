package com.envy.javadesignmode.create.builder;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/2/4 14:01
 * email: 157010607@qq.com
 */

public class BuilderTestUtils extends TestUtils{

    public BuilderTestUtils(Activity mAct) {
        super(mAct);
    }

    public void  testBuilderMode(){
        AirshipDirector director=new ShenzhouIXAirshipDirector(new ShenZhouIXAirshipBuilder());
        director.directAirship();
        Airship ship=director.getAirShip();
        ship.launch();
    }
}
