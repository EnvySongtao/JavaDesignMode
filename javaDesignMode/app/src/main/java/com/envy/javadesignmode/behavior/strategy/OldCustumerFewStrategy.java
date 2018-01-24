package com.envy.javadesignmode.behavior.strategy;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/27 10:50
 * email: 157010607@qq.com
 */

public class OldCustumerFewStrategy implements Strategy {

    private String TAG = "Strategy";

    @Override
    public double getPrice(double originalPrice) {
        Log.i(TAG, "it has 0.95 discount that old custumer buy few .");
        return originalPrice * 0.95;
    }
}
