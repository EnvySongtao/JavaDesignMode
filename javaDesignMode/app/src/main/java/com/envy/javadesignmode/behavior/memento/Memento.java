package com.envy.javadesignmode.behavior.memento;

/**
 * 备忘录类
 * author: GuoSongtao on 2017/2/27 17:59
 * email: 157010607@qq.com
 */

public class Memento {
    private String name;
    private String age;
    private String salary;



    public Memento(Originator originator) {
        this.name = originator.getName();
        this.age = originator.getAge();
        this.salary = originator.getSalary();
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

    @Override
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
