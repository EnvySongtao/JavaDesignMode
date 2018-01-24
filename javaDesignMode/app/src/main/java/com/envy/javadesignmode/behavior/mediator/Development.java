package com.envy.javadesignmode.behavior.mediator;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/21 18:04
 * email: 157010607@qq.com
 */

public class Development implements DepartMent {
    public static String ACTION_WRITE_CODE="writeCode";
    private static String REQUEST_NO_MONEY="noMoney";

    Mediator madiator;
    public Development(Mediator madiator) {
        this.madiator = madiator;
        madiator.register(ACTION_WRITE_CODE,this);
    }

    @Override
    public void selfAction(String action) {
        if(ACTION_WRITE_CODE.equals(action)){
            Log.i("Development", "开发人员使劲写代码！");
        }
    }

    @Override
    public void requestAction(String request) {
        Log.i("Development", "汇报工作！钱不够时，请求资金支持！");
        madiator.command(Financial.ACTION_PAYMONEY);
    }
}
