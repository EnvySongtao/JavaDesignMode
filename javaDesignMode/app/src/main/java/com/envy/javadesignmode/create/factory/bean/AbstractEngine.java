package com.envy.javadesignmode.create.factory.bean;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/1/22 16:59
 * email: 157010607@qq.com
 */

public interface AbstractEngine {
    void run();
    void start();
}


class LuxuryEngine implements AbstractEngine{
    @Override
    public void run() {
        Log.i("高级发动机","转速快,转速平稳!");
    }

    @Override
    public void start() {
        Log.i("高级发动机","启动速度快,能自动熄火!");
    }
}

class LowEngine implements AbstractEngine{
    @Override
    public void run() {
        Log.i("低级发动机","转速慢,油耗高!");
    }

    @Override
    public void start() {
        Log.i("低级发动机","启动速度慢,太冷不一定能启动!");
    }
}