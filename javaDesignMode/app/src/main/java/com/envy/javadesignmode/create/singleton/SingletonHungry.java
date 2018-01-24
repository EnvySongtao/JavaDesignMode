package com.envy.javadesignmode.create.singleton;

/**
 * author: GuoSongtao on 2017/1/19 15:42
 * email: 157010607@qq.com
 */

public class SingletonHungry {
    //懒汉式 会在static变量会在类装载时初始化，此时不会涉及到多个对象访问问题，虚拟机只进行一次类装载，所以不存在并发问题
    private static SingletonHungry singletonHungry=new SingletonHungry();

    private SingletonHungry() {
    }

    /**
     * 没并发问题 不用synchronized
     * 但是单例对象在类装载就生成了，可能存在一直不是用的情况，这样会造成资源浪费
     * @return
     */
    public static SingletonHungry getInstance(){
        return singletonHungry;
    }
}
