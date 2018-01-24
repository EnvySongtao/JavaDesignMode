package com.envy.javadesignmode.structure.facade;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/17 14:45
 * email: 157010607@qq.com
 */

public interface LuancherApp {
    void luancher();
}

class HuaWeiLuancher implements LuancherApp{
    @Override
    public void luancher() {
        Log.i("HuaWeiLuancher", "华为开机应用打开！");
    }
}