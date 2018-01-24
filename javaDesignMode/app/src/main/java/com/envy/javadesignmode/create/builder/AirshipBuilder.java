package com.envy.javadesignmode.create.builder;

/**
 * Builder用于对象的子组件的单独构造
 * Director（导演;主管，主任;董事，理事;负责人，监督者）用于对象子组件的组装
 * author: GuoSongtao on 2017/2/4 11:33
 * email: 157010607@qq.com
 */

public interface AirshipBuilder {
    EscapeTower builderEcapeTower();
    OrbitalModule builderOrbitalModule();
    Engine builderEngine();
}
