package com.envy.javadesignmode.structure.facade;

import android.util.Log;

/**
 * 外观模式中的Clients 客户对象通过一个外观接口读写子系统中各接口的数据资源。
 * author: GuoSongtao on 2017/2/17 15:03
 * email: 157010607@qq.com
 */

public class User {
    /**
     * 未使用外观模式时，调用者实现功能要了解被调用者中实现过程的步骤，即user开机要完全了解手机开机的步骤
     */
    public void openMobilePhone(){
        PowerKey powerkey=new HuaweiPowerKey();
        powerkey.openPower();
        CPUAndMemory cpu=new HuaWeiCPUAndMemory();
        cpu.runSoftware();
        LuancherApp app=new HuaWeiLuancher();
        app.luancher();
        MobileScreen screen=new HuaWeiMobileScreen();
        screen.showAppRunningEffect();
        Log.i("User", "用户打开了手机！");
    }

    /**
     * 使用外观模式时，user只要知道他让手机开机了的就对了，手机怎样实现开机的，他可以不用知道
     */
    public void openMobilePhoneByFacadeMode(){
        Phone phone=new HuaWeiMobilePhone();
        phone.open();
        Log.i("User", "用户打开了手机！");
    }


}
