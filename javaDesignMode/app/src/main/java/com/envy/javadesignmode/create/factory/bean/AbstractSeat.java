package com.envy.javadesignmode.create.factory.bean;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/1/22 17:06
 * email: 157010607@qq.com
 */

public interface AbstractSeat {
    void sit();
}

class LuxurySeat implements AbstractSeat{
    @Override
    public void sit() {
        Log.i("高级座位","柔软舒适,附带按摩功能！");
    }
}
class LowSeat implements AbstractSeat{
    @Override
    public void sit() {
        Log.i("低级座位","粗硬难受！");
    }
}