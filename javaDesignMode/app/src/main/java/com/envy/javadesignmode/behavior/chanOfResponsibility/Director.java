package com.envy.javadesignmode.behavior.chanOfResponsibility;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/20 14:39
 * email: 157010607@qq.com
 */

public class Director extends Leader {

    private String TAG="Director";

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getDays()<=3){
            Log.i(TAG, "handleRequest,姓名："+request.getName()+",请假天数："+request.getDays()+",原因:"+request.getReason());
            Log.i(TAG, "主管："+name+"同意请假！");
        }else {
            if(nextLeader!=null){
                Log.i(TAG, "主管："+name+"无法授权请假，交给上级"+nextLeader.name+"审批！");
                nextLeader.handleRequest(request);
            }
        }
    }
}
