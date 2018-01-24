package com.envy.javadesignmode.structure.adapter;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/2/7 13:33
 * email: 157010607@qq.com
 */
public class AdapterTestUtils extends TestUtils{

    public AdapterTestUtils(Activity mAct) {
        super();
    }

    public void testObjectAdapter(){

        Adaptee mAdaptee=new Adaptee();
        Target target=new ObjectAdapter(mAdaptee);
        target.request();
    }

    public void testClazzAdapter(){

        Target target=new ClazzAdapter();
        target.request();
    }

}
