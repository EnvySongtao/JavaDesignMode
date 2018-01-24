package com.envy.javadesignmode.behavior.strategy;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class StartegyTestUtils extends TestUtils{

    public StartegyTestUtils(Activity mAct) {
        super(mAct);
    }


    public void test() {

        Strategy strategy=new OldCustumerLargeStrategy();
        Context context=new Context(strategy);
        context.printPricee(398);
    }

}
