package com.envy.javadesignmode.create.factory.bean;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/1/22 17:10
 * email: 157010607@qq.com
 */

public interface AbstractTyre {
    void revolve();
}

class LuxuryTyre implements AbstractTyre{
    @Override
    public void revolve() {
        Log.i("高级轮胎","抗晒抗寒,不易磨损！");
    }
}
class LowTyre implements AbstractTyre{
    @Override
    public void revolve() {
        Log.i("低级轮胎","易爆胎！");
    }
}