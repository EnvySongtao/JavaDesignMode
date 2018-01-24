package com.envy.javadesignmode.create.prototype;

import java.util.Date;

/**
 * 深克隆不仅能将基本属性复制，还需要将属性是复杂类型数据再复制一次，所以需要构建类的作者仔细处理
 * author: GuoSongtao on 2017/2/4 16:40
 * email: 157010607@qq.com
 * 处理数据原子读取操作（读取某一刻的数据），以及模拟数据的操作(下象棋，打牌等)
 */

public class DeepCloneSheep implements Cloneable {
    private String sname;
    private Date birthday;

    public DeepCloneSheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneSheep sheep= (DeepCloneSheep) super.clone();
        //还需要将属性是复杂类型数据再复制一次
        Date mBirthday= (Date) sheep.getBirthday().clone();
        sheep.setBirthday(mBirthday);
        return sheep;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DeepCloneSheep[sname="+sname+",birthday="+birthday+"]";
    }
}
