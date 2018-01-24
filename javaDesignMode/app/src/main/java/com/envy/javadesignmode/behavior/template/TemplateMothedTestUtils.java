package com.envy.javadesignmode.behavior.template;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class TemplateMothedTestUtils extends TestUtils{

    private String TAG="TemplateMothedTestUtils";

    public TemplateMothedTestUtils(Activity mAct) {
        super(mAct);
    }

    public void test() {

        BankTemplate bankTemplate=new DrawMoney();
        bankTemplate.process();
        Log.i(TAG, "test:---------------------------------");
        BankTemplate bankTemplate1=new BankTemplate() {
            @Override
            public void transact() {
                Log.i(TAG, "I want to handle card ! ");
            }
        };
        bankTemplate1.process();
        Log.i(TAG, "test:---------------------------------");
        new BankTemplate() {
            @Override
            public void transact() {
                Log.i(TAG, "I want to handle financing ! ");
            }
        }.process();
    }

}

class DrawMoney extends BankTemplate{

    private String TAG="DrawMoney";

    @Override
    public void transact() {
        Log.i(TAG, "I want to draw money！");
    }
}
