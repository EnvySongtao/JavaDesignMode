package com.envy.javadesignmode.structure.bridge;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

import java.lang.reflect.Proxy;

/**
 * author: GuoSongtao on 2017/2/7 15:31
 * email: 157010607@qq.com
 */

public class BridgeTestUtils extends TestUtils{

    public BridgeTestUtils(Activity mAct) {
        super(mAct);
    }

    /**
     *
     */
    public void testComputerWithBridge(){
        ComputerWithBridge computer=new DesktopComputer1(new Lenovo());
        computer.sell();
    }


}
