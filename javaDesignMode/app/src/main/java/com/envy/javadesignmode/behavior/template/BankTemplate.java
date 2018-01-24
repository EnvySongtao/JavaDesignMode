package com.envy.javadesignmode.behavior.template;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/27 16:42
 * email: 157010607@qq.com
 */

public abstract class BankTemplate {
    private String TAG="BankTemplate";

    public void process(){
        Log.i(TAG, "the process of bank: ");
        queueUp();
        transact();
        score();
    }

    public void queueUp(){
        Log.i(TAG, "queue up , then waiting!");
    }

    public void score(){
        Log.i(TAG, "score for bank staff!");
    }

    public abstract void transact();
}
