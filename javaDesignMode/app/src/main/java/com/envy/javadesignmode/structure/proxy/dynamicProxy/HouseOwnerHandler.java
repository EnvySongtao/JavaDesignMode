package com.envy.javadesignmode.structure.proxy.dynamicProxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * author: GuoSongtao on 2017/2/10 10:05
 * email: 157010607@qq.com
 * invocation  祈祷;乞求;乞灵;乞求神助；调用
 */

public class HouseOwnerHandler implements InvocationHandler {
    private DynamicHousesOwner housesOwner;

    public HouseOwnerHandler(DynamicHousesOwner housesOwner) {
        this.housesOwner = housesOwner;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj=null;

        //交房动作交给真正的房东
        if("deliverHouse".equals(method.getName())){
            obj=method.invoke(housesOwner,args);
        }else{//需要代理处理的类
            Log.i("HouseOwnerHandler", "dynamic proxy "+method.getName());
        }

        return obj;
    }
}
