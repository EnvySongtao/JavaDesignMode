package com.envy.javadesignmode.structure.proxy.dynamicProxy;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/7 15:49
 * email: 157010607@qq.com
 */

public class DynamicRealHouseOwner implements DynamicHousesOwner {

    private String TAG="StaticRealObject";

    @Override
    public void showHousesInfo() {
        Log.i(TAG, "showHousesInfo: ");
    }

    @Override
    public void confer() {
        Log.i(TAG, "confer: ");
    }

    @Override
    public void signContract() {
        Log.i(TAG, "signContract: ");
    }

    @Override
    public void deliverHouse() {
        Log.i(TAG, "deliverHouse: ");
    }

    @Override
    public void collectMoney() {
        Log.i(TAG, "collectMoney: ");
    }
}
