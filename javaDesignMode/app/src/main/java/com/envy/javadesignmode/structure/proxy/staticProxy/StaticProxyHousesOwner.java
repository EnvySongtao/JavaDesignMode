package com.envy.javadesignmode.structure.proxy.staticProxy;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/7 15:48
 * email: 157010607@qq.com
 */

public class StaticProxyHousesOwner implements StaticHousesOwner{

    private  StaticRealHouseOwner realHouseOwner;
    private String TAG="StaticProxyer";

    public StaticProxyHousesOwner(StaticRealHouseOwner realHouseOwner) {
        this.realHouseOwner = realHouseOwner;
    }

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
        realHouseOwner.deliverHouse();
    }

    @Override
    public void collectMoney() {
        Log.i(TAG, "collectMoney: ");
    }
}
