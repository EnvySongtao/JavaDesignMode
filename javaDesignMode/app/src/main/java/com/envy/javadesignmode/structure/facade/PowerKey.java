package com.envy.javadesignmode.structure.facade;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/17 14:50
 * email: 157010607@qq.com
 */

public interface PowerKey {
    void openPower();
    void closePower();
}

class HuaweiPowerKey implements PowerKey{
    @Override
    public void openPower() {
        Log.i("HuaweiPowerKey", "电源键开启电源！");
    }

    @Override
    public void closePower() {
        Log.i("HuaweiPowerKey", "电源键关闭电源！");
    }
}