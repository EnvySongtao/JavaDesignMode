package com.envy.javadesignmode.behavior.mediator;

/**
 *
 * Mediator 调解人;调停者;传递者;中介物
 * author: GuoSongtao on 2017/2/21 17:58
 * email: 157010607@qq.com
 * 调解人接口(总经理)，各个部门都只认总经理，请求由总经理分配其他人完成，任务由总经理发出
 */

public interface Mediator {
    void command(String action);
    void register(String request,DepartMent departMent);
}
