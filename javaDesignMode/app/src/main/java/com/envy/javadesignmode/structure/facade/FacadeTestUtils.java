package com.envy.javadesignmode.structure.facade;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.structure.decorator.Car;
import com.envy.javadesignmode.structure.decorator.FlyCar;
import com.envy.javadesignmode.structure.decorator.WaterCar;

/**
 * author: GuoSongtao on 2017/2/7 15:31
 * email: 157010607@qq.com
 */

public class FacadeTestUtils extends TestUtils{

    public FacadeTestUtils(Activity mAct) {
        super(mAct);
    }

    /**
     * 测试外观模式
     */
    public void testFacade(){
        User user=new User();
//        user.openMobilePhone();
        user.openMobilePhoneByFacadeMode();
    }

}
