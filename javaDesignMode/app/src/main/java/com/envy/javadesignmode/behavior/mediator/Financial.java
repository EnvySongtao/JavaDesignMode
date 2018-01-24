package com.envy.javadesignmode.behavior.mediator;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/21 18:04
 * email: 157010607@qq.com
 */

public class Financial implements DepartMent {
    public static String ACTION_PAYMONEY="payMoney";
    public static String REQUEST_TOO_MUCH_MONEY="toMuchMoney";

    Mediator madiator;
    public Financial(Mediator madiator) {
        this.madiator = madiator;
        madiator.register(ACTION_PAYMONEY,this);
    }

    @Override
    public void selfAction(String action) {
        if(ACTION_PAYMONEY.equals(action)){
            Log.i("Financial", "数钱，拨款！");
        }
    }

    @Override
    public void requestAction(String request) {
        Log.i("Financial", "没钱了，节流不行，请求开源！");
        madiator.command(Market.ACTION_SELL);
    }
}
