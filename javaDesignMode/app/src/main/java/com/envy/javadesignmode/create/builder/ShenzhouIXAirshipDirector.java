package com.envy.javadesignmode.create.builder;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/4 13:47
 * email: 157010607@qq.com
 * 用于特别复杂类的创建，且基本很少出现相似的对象，设计者站在统筹角度，设计最终类，不关心具体创建过程
 */

public class ShenzhouIXAirshipDirector implements AirshipDirector {
    private AirshipBuilder builder;
    private Airship airship;

    public ShenzhouIXAirshipDirector(AirshipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void directAirship() {
        Engine engine=builder.builderEngine();
        EscapeTower tower=builder.builderEcapeTower();
        OrbitalModule module=builder.builderOrbitalModule();

        airship=new Airship();
        airship.setEngine(engine);
        airship.setEscapeTower(tower);
        airship.setOrbitalModule(module);
        Log.i("AirshipDirector","XX组装了神州9号！");
    }

    @Override
    public Airship getAirShip() {
        return airship;
    }
}
