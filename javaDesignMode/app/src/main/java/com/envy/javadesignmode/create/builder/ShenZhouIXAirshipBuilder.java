package com.envy.javadesignmode.create.builder;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/4 11:48
 * email: 157010607@qq.com
 */

public class ShenZhouIXAirshipBuilder implements AirshipBuilder {
    @Override
    public EscapeTower builderEcapeTower() {
        Log.i("AirshipBuilder","XXX创建了神州9号逃逸塔！");
        return new EscapeTower("神州9号逃逸塔");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        Log.i("AirshipBuilder","XXX创建了神州9号轨道舱！");
        return new OrbitalModule("神州9号轨道舱");
    }

    @Override
    public Engine builderEngine() {
        Log.i("AirshipBuilder","XXX创建了神州9号推进器！");
        return new Engine("神州9号推进器");
    }
}
