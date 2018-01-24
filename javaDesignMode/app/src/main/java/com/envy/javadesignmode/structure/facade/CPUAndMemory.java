package com.envy.javadesignmode.structure.facade;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/17 14:54
 * email: 157010607@qq.com
 */

public interface CPUAndMemory {//Hardware
    void runSoftware();
}

class HuaWeiCPUAndMemory implements CPUAndMemory{
    @Override
    public void runSoftware() {
        Log.i("HuaWeiCPUAndMemory", "硬件准备完毕，准备运行软件！ ");
    }
}