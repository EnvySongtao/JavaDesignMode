package com.envy.javadesignmode.behavior.chanOfResponsibility;

import android.util.Log;

/**
 * vice，（恶习;不道德行为;（肉体的）缺陷，疾病;（文体等的）缺点，瑕疵；代替;取代；副的;代替的；用老虎钳夹紧;钳制）
 * author: GuoSongtao on 2017/2/20 14:39
 * email: 157010607@qq.com
 */

public class ViceGeneralManager extends Leader {

    private String TAG = "ViceGeneralManager";

    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= 20) {
            Log.i(TAG, "handleRequest,姓名：" + request.getName() + ",请假天数：" + request.getDays() + ",原因:" + request.getReason());
            Log.i(TAG, "副总经理：" + name + "同意请假！");
        } else {
            if(nextLeader!=null){
                Log.i(TAG, "副总经理："+name+"无法授权请假，交给上级"+nextLeader.name+"审批！");
                nextLeader.handleRequest(request);
            }
        }
    }
}
