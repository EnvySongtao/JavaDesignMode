package com.envy.javadesignmode.behavior.strategy;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/27 10:50
 * email: 157010607@qq.com
 */

public class NewCustumerLargeStrategy implements Strategy {

    private String TAG = "Strategy";

    @Override
    public double getPrice(double originalPrice) {
        Log.i(TAG, "it has 0.9 discount that new custumer buy large .");
        return originalPrice * 0.9;
    }
}
