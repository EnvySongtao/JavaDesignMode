package com.envy.javadesignmode.structure.adapter;


import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * 类适配器模式 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。　　
 * author: GuoSongtao on 2017/2/7 14:08
 * email: 157010607@qq.com
 */

public class ClazzAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        //Log.i("Target","This is a common request!");
        super.specialRequest();
    }
}
