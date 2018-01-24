package com.envy.javadesignmode.behavior.mediator;

/**
 * author: GuoSongtao on 2017/2/21 18:01
 * email: 157010607@qq.com
 * 部门接口，各个部门都只认总经理，请求由总经理分配其他人完成，任务由总经理发出
 */
public interface  DepartMent {
    void selfAction(String action);
    void requestAction(String request);
}
