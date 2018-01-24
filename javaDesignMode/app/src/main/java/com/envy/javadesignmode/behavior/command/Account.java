package com.envy.javadesignmode.behavior.command;

import android.util.Log;

/**
 * 接收者（Receiver）：真正执行命令的对象。任何类都可能成为一个接收者，只要能实现命令要求实现的相应功能
 * author: GuoSongtao on 2017/2/24 17:48
 * email: 157010607@qq.com
 */

public class Account {
    private double totalMoney;
    private String TAG="Account";

    public Account() {
    }

    public Account(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void moneyIn(double changeAmt) {
        this.totalMoney += changeAmt;
        Log.i(TAG, "Account put in money:"+changeAmt);
    }

    public void moneyOut(double changeAmt) {
        this.totalMoney -= changeAmt;
        Log.i(TAG, "Account take out money:"+changeAmt);
    }
}
