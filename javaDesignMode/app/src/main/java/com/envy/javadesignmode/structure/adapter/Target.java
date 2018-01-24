package com.envy.javadesignmode.structure.adapter;

import android.util.Log;

/**
 * 目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口。
 * author: GuoSongtao on 2017/2/7 13:48
 * email: 157010607@qq.com
 *
 * 实现类有v7和v4 support包中的类，如AppCompatActivity是Activity的FragmentActivity的类适配模式实现
 * 和listview的BaseAdapter没任何关系，listview的BaseAdapter只是为了家将同一个类的对象，按统一风格适配显示
 */

public interface Target {
    void request();
}
