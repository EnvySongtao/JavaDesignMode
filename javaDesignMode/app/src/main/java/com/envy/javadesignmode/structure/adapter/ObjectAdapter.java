package com.envy.javadesignmode.structure.adapter;


import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * 将一个类的接口转换成客户希望的另外一个接口。
 * Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。
 *
 * 在GoF的设计模式中，对适配器模式讲了两种类型，类适配器模式和对象适配器模式。
 * 由于类适配器模式通过多重继承对一个接口与另一个接口进行匹配，
 * 而C#、java等语言都不支持多重继承，因而这里只是介绍对象适配器。
 *
 * 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。
 * author: GuoSongtao on 2017/2/7 14:08
 * email: 157010607@qq.com
 */

public class ObjectAdapter implements Target {
    private Adaptee mAdaptee;

    public ObjectAdapter(Adaptee mAdaptee) {
        this.mAdaptee = mAdaptee;
    }

    @Override
    public void request() {
        //Log.i("Target","This is a common request!");
        mAdaptee.specialRequest();
    }
}
