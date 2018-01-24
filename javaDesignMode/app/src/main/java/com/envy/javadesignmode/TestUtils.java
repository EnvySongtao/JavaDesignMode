package com.envy.javadesignmode;

import android.app.Activity;
import android.widget.TextView;

/**
 * author: GuoSongtao on 2017/5/19 10:57
 * email: 157010607@qq.com
 */

public class TestUtils {

    protected Activity mAct;

    protected TextView tv_show1, tv_show2;
    protected TextView btn_test;

    public TestUtils(Activity mAct){
        this.mAct = mAct;
        mAct.setContentView(R.layout.act_test);
        tv_show1= (TextView) mAct.findViewById(R.id.tv_show1);
        tv_show2= (TextView) mAct.findViewById(R.id.tv_show2);
        btn_test= (TextView) mAct.findViewById(R.id.btn_test);
    }

    public TestUtils() {
        //子类无参构造方法会自动调用父类无参构造方法，最好保留无参构造方法
    }
}
