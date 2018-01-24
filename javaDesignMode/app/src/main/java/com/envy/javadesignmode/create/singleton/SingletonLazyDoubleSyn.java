package com.envy.javadesignmode.create.singleton;

/**
 * author: GuoSongtao on 2017/1/19 15:49
 * email: 157010607@qq.com
 * 不建议使用，因为JVM底层模型原因，偶尔会出现问题
 */

public class SingletonLazyDoubleSyn {
    private static SingletonLazyDoubleSyn singletonLazy = null;

    private SingletonLazyDoubleSyn() {
    }

    /**
     * 双重synchronized防止并发 实现懒汉式
     * 但是这也导致 并发使用的时候效率低
     *
     * @return
     */
    public static SingletonLazyDoubleSyn getInstance() {
        if (singletonLazy == null) {
            SingletonLazyDoubleSyn synSingleton;
            synchronized (SingletonLazyDoubleSyn.class) {
                synSingleton = singletonLazy;
                if (synSingleton == null) {
                    synchronized (SingletonLazyDoubleSyn.class) {
                        if (synSingleton == null) {
                            synSingleton = new SingletonLazyDoubleSyn();
                        }
                    }
                    singletonLazy = synSingleton;
                }
            }
        }
        return singletonLazy;
    }

    /**
     * 双重检查加同步锁 防止并发 实现懒汉式
     * 但是这也导致 并发使用的时候效率低
     *
     * @return
     */
    public static SingletonLazyDoubleSyn getInstance2Checking() {
        if (singletonLazy == null) {
            synchronized (SingletonLazyDoubleSyn.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazyDoubleSyn();
                }
            }
        }
        return singletonLazy;
    }
}
