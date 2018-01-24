package com.envy.javadesignmode.behavior.chanOfResponsibility;

/**
 * author: GuoSongtao on 2017/2/20 14:28
 * email: 157010607@qq.com
 */

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请假
     */
    public abstract void handleRequest(LeaveRequest request);
}
