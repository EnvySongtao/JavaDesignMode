package com.envy.javadesignmode.behavior.command;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class CommandTestUtils extends TestUtils{

    public CommandTestUtils(Activity mAct) {
        this.mAct = mAct;
    }

    public void test() {
        Account account=new Account();
        Command inMoney=new MoneyInCommand(account,980);
        Command outMoney=new MoneyOutCommand(account,200);
        Invoker invoker=new Invoker();
        invoker.setCommand(outMoney);
        invoker.setCommand(inMoney);
        invoker.executeCommand();
        Log.i("CommandTestUtils", "account money ："+account.getTotalMoney());
        invoker.setCommand(outMoney);
        invoker.executeCommand();
        Log.i("CommandTestUtils", "account money ："+account.getTotalMoney());
    }

}
