package com.envy.javadesignmode.behavior.memento;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class MementoTestUtils {
    private Activity mAct;

    private TextView tv_show1, tv_show2;
    private TextView btn_test;
    private String TAG="MementoTestUtils";


    public MementoTestUtils(Activity mAct) {
        this.mAct = mAct;
    }


    public void test() {
        initViews();
        Originator originator=new Originator("王五","25","3500");
        CareTaker careTaker=new CareTaker();
        careTaker.saveMemeto(originator.createMemento());
        originator.setName("张三");
        Log.i(TAG, careTaker.retrieveMemento().toString());
        careTaker.saveMemeto(originator.createMemento());
        Log.i(TAG, careTaker.retrieveMemento().toString());
        originator.setSalary("7600");
        careTaker.saveMemeto(originator.createMemento());
        Log.i(TAG, careTaker.retrieveMemento().toString());

    }

    private void initViews() {
        mAct.setContentView(R.layout.act_test);
        tv_show1 = (TextView) mAct.findViewById(R.id.tv_show1);
        tv_show2 = (TextView) mAct.findViewById(R.id.tv_show2);
        btn_test = (TextView) mAct.findViewById(R.id.btn_test);
    }
}
