package com.envy.javadesignmode.create.builder;

import android.util.Log;

/**
 * 宇宙飞船类 通过builder模式来实现
 * author: GuoSongtao on 2017/2/4 11:18
 * email: 157010607@qq.com
 */
public class Airship {
    private EscapeTower escapeTower;
    private OrbitalModule orbitalModule;
    private Engine engine;


    public Airship() {
    }

    public void launch(){
        Log.i("Airship","飞行员启动了"+this.getEngine().getName());
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

/**
 * 逃逸塔（脱险装置）
 */
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/**
 * OrbitalModule 轨道舱
 */
class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/**
 * Airship 中的 Engine对象类
 */
class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}