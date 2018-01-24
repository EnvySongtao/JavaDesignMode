package com.envy.javadesignmode.structure.facade;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/17 14:59
 * email: 157010607@qq.com
 */
public interface MobileScreen {
    void showAppRunningEffect();
}

class HuaWeiMobileScreen implements  MobileScreen{
    @Override
    public void showAppRunningEffect() {
        Log.i("HuaWeiMobileScreen", "手机屏幕展示App运行效果！");
    }
}
