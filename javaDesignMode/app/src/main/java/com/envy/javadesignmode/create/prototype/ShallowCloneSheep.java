package com.envy.javadesignmode.create.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 浅克隆只能将基本属性复制，然而复杂类型数据依然使用的是同一个对象
 * author: GuoSongtao on 2017/2/4 16:40
 * email: 157010607@qq.com
 */

public class ShallowCloneSheep implements Cloneable,Serializable {
    private String sname;
    private Date birthday;

    public ShallowCloneSheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCloneSheep sheep= (ShallowCloneSheep) super.clone();
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
        return "ShallowCloneSheep[sname="+sname+",birthday="+birthday+"]";
    }
}
