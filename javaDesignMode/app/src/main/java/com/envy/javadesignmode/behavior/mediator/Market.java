package com.envy.javadesignmode.behavior.mediator;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/21 18:04
 * email: 157010607@qq.com
 */

public class Market implements DepartMent {
    public static String ACTION_SELL="sell";
    public static String REQUEST_HAS_BUG="toMuchMoney";

    Mediator madiator;
    public Market(Mediator madiator) {
        this.madiator = madiator;
        madiator.register(ACTION_SELL,this);
    }

    @Override
    public void selfAction(String action) {
        if(ACTION_SELL.equals(action)){
            Log.i("Market", "数钱，拨款！");
        }
    }

    @Override
    public void requestAction(String request) {
        Log.i("Market", "钱太多如何处理！");
        madiator.command(Development.ACTION_WRITE_CODE);
    }
}
