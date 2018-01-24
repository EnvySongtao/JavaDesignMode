package com.envy.javadesignmode.structure.facade;

/**
 * 外观模式中的Facade,对user封装的子系统接口，实现手机内部操作
 * author: GuoSongtao on 2017/2/17 15:09
 * email: 157010607@qq.com
 */

public interface Phone {
    void open();
}

class HuaWeiMobilePhone implements Phone{
    @Override
    public void open() {
        PowerKey powerkey=new HuaweiPowerKey();
        powerkey.openPower();
        CPUAndMemory cpu=new HuaWeiCPUAndMemory();
        cpu.runSoftware();
        LuancherApp app=new HuaWeiLuancher();
        app.luancher();
        MobileScreen screen=new HuaWeiMobileScreen();
        screen.showAppRunningEffect();
    }
}
