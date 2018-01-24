package com.envy.javadesignmode.behavior.chanOfResponsibility;

import android.util.Log;

/**
 * general（普遍的;大致的;综合的;总的，全体的；一般;常规;上将;一般原则）
 * author: GuoSongtao on 2017/2/20 14:39
 * email: 157010607@qq.com
 */

public class GeneralManager extends Leader {

    private String TAG = "GeneralManager";

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= 30) {
            Log.i(TAG, "handleRequest,姓名：" + request.getName() + ",请假天数：" + request.getDays() + ",原因:" + request.getReason());
            Log.i(TAG, "总经理：" + name + "同意请假！");
        } else {
            Log.i(TAG, "总经理：" + name + "不想给予授权，认为员工" + request.getName() + "请假过多，态度不端正！");
        }
    }
}
