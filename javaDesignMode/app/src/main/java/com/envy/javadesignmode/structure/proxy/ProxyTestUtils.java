package com.envy.javadesignmode.structure.proxy;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.structure.proxy.dynamicProxy.DynamicHousesOwner;
import com.envy.javadesignmode.structure.proxy.dynamicProxy.DynamicRealHouseOwner;
import com.envy.javadesignmode.structure.proxy.dynamicProxy.HouseOwnerHandler;
import com.envy.javadesignmode.structure.proxy.staticProxy.StaticProxyHousesOwner;
import com.envy.javadesignmode.structure.proxy.staticProxy.StaticRealHouseOwner;

import java.lang.reflect.Proxy;

/**
 * author: GuoSongtao on 2017/2/7 15:31
 * email: 157010607@qq.com
 */

public class ProxyTestUtils extends TestUtils{


    public ProxyTestUtils(Activity mAct) {
        super(mAct);
    }


    /**
     * 测试静态代理
     */
    public void testStaticProxy(){

        StaticRealHouseOwner realHouseOwner=new StaticRealHouseOwner();
        StaticProxyHousesOwner proxyHousesOwner=new StaticProxyHousesOwner(realHouseOwner);

        proxyHousesOwner.showHousesInfo();
        proxyHousesOwner.confer();
        proxyHousesOwner.signContract();
        proxyHousesOwner.deliverHouse();
        proxyHousesOwner.collectMoney();
    }

    /**
     * 测试动态代理
     */
    public void testDynamicProxy(){

        DynamicRealHouseOwner realHousesOwner=new DynamicRealHouseOwner();
        try {
            HouseOwnerHandler handler = new HouseOwnerHandler(realHousesOwner);
            //ClassLoader.getSystemClassLoader() java中不会报错，但是到了Android会报错
            DynamicHousesOwner housesOwner= (DynamicHousesOwner) Proxy.newProxyInstance(
                    DynamicHousesOwner.class.getClassLoader(),new Class[]{DynamicHousesOwner.class}, handler);

            housesOwner.showHousesInfo();
            housesOwner.confer();
            housesOwner.signContract();
            housesOwner.deliverHouse();
            housesOwner.collectMoney();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
