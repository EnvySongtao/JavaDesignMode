package com.envy.javadesignmode.behavior.chanOfResponsibility;

/**
 * author: GuoSongtao on 2017/2/20 14:26
 * email: 157010607@qq.com
 */

public class LeaveRequest {
    private String name;
    private int days;
    private String reason;

    public LeaveRequest(String name, int days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
