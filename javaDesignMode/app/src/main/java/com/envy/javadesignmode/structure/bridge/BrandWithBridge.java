package com.envy.javadesignmode.structure.bridge;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/10 11:35
 * email: 157010607@qq.com
 */
public interface BrandWithBridge {
    void sell();
}

class Lenovo implements BrandWithBridge{
    protected String TAG="BrandWithBridge";
    @Override
    public void sell() {
        Log.i(TAG, "sell: lenovo computer");
    }
}

class Dell implements BrandWithBridge{
    protected String TAG="BrandWithBridge";
    @Override
    public void sell() {
        Log.i(TAG, "sell: dell computer");
    }
}

class ShenZhou implements BrandWithBridge{
    protected String TAG="BrandWithBridge";
    @Override
    public void sell() {
        Log.i(TAG, "sell: shenzhou computer ");
    }
}
