package com.envy.javadesignmode.behavior.strategy;

import android.util.Log;

/**
 * 管理策略族 对应的策略
 * author: GuoSongtao on 2017/2/27 10:58
 * email: 157010607@qq.com
 */
public class Context {
    private Strategy strategy;
    private String TAG="Context";

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void printPricee(double originalPrice){
        Log.i(TAG, "the original price is : "+originalPrice);
        Log.i(TAG, "Now , the price is : "+strategy.getPrice(originalPrice));
    }
}
