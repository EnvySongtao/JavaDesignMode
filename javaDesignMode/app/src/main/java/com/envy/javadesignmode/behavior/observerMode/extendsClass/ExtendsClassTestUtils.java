package com.envy.javadesignmode.behavior.observerMode.extendsClass;

/**
 * author: GuoSongtao on 2017/1/18 16:26
 * email: 157010607@qq.com
 * 有点类似回调，只是回调是一个回调接口对象，而观察者是一个接口对象集合（0~n回调接口对象）
 */
public class ExtendsClassTestUtils {
    public static void testObserverMode(){
        ExtendsObserver observer1=new ExtendsObserver("观察者1");
        ExtendsObserver observer2=new ExtendsObserver("观察者2");
        ExtendsObservable myObservable=new ExtendsObservable();

        //为被观察者添加 观察者
        myObservable.addObserver(observer1);
        myObservable.addObserver(observer2);

        //被观察者通知自己发生了改变
        myObservable.notifyObservers();//所有
        myObservable.notifyObservers(observer1);//单个
    }
}
