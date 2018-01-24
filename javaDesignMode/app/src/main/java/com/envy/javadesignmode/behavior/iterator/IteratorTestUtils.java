package com.envy.javadesignmode.behavior.iterator;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.behavior.chanOfResponsibility.Director;
import com.envy.javadesignmode.behavior.chanOfResponsibility.GeneralManager;
import com.envy.javadesignmode.behavior.chanOfResponsibility.Leader;
import com.envy.javadesignmode.behavior.chanOfResponsibility.LeaveRequest;
import com.envy.javadesignmode.behavior.chanOfResponsibility.Manager;
import com.envy.javadesignmode.behavior.chanOfResponsibility.ViceGeneralManager;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class IteratorTestUtils extends TestUtils{

    public IteratorTestUtils(Activity mAct) {
        super(mAct);
    }


    public void test() {
        ConcreteMyAggregate c = new ConcreteMyAggregate();
        c.getObjectList().add("aaaabs");
        c.getObjectList().add("bbbbbs");
        c.getObjectList().add("ccccbs");
        c.getObjectList().add("ddddbs");
        MyIterator iterator = c.getIterator();
        while (iterator.hasNext()) {
            Log.i("IteratorTestUtils", "print:"+iterator.getCurrentObject());
            iterator.toNext();
        }
    }

}
