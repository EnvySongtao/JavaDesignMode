package com.envy.javadesignmode.behavior.memento;

/**
 * author: GuoSongtao on 2017/2/27 18:00
 * email: 157010607@qq.com
 */

public class CareTaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return memento;
    }

    public void saveMemeto(Memento memento){
        this.memento=memento;
    }
}
