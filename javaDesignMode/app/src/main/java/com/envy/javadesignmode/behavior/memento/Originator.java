package com.envy.javadesignmode.behavior.memento;

/**
 * 源发器类
 * author: GuoSongtao on 2017/2/27 17:59
 * email: 157010607@qq.com
 */

public class Originator {
    private String name;
    private String age;
    private String salary;

    public Originator(String name) {
        this.name = name;
    }

    public Originator(String name, String age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public  Memento createMemento(){
        return new Memento(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
