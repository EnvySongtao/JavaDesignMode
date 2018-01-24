package com.envy.javadesignmode.create.singleton;

import java.io.Serializable;

/**
 * author: GuoSongtao on 2017/1/19 15:49
 * email: 157010607@qq.com
 */

public class SingletonLazy implements Serializable {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
        //测试结果发现：并没能消除掉 反射构造方法创建新对象
        if (singletonLazy != null) {
            //"The constructor of SingletonLazy has created,singletonLazy instance is existed!"
            throw new RuntimeException();
        }
    }

    /**
     * synchronized防止 singletonHungry==null时 多个进程同时调用getSingletonHungry（） 导致创建多个singletonHungry
     * 但是这也导致 并发使用的时候效率低
     *
     * @return
     */
    public static synchronized SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    //
    private Object readResolve(){
        return singletonLazy;
    }
}
