package com.envy.javadesignmode.create.singleton;

/**
 * author: GuoSongtao on 2017/1/19 17:18
 * email: 157010607@qq.com
 * 静态内部类去实现懒汉式加载
 * 静态内部类式 资源大且需要延迟加载时 效果好于懒汉式
 */

public class SingletonStaticInnerClass {
    private static class InnerInstance{
        private static final SingletonStaticInnerClass instance=new SingletonStaticInnerClass();
    }

    private SingletonStaticInnerClass(){}

    /**
     * 因为使用的是静态内部类加载，类加载并不存在并发情况，所以不需要在方法前加上synchronized
     * @return
     */
    public static SingletonStaticInnerClass getInstance(){
        return InnerInstance.instance;
    }
}
