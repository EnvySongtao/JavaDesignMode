package com.envy.javadesignmode.behavior.mediator;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.behavior.observerMode.MyDownloadObservable;
import com.envy.javadesignmode.behavior.observerMode.MyDownloadObserver;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class MediatorTestUtils extends TestUtils{

    public MediatorTestUtils(Activity mAct) {
        super(mAct);
    }


    public void testMediator() {
        President president=new President();
        Market market=new Market(president);
        Development development=new Development(president);

        market.selfAction(Market.ACTION_SELL);
        market.requestAction(Development.ACTION_WRITE_CODE);
    }

}
