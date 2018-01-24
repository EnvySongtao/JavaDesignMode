package com.envy.javadesignmode.create.prototype;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * author: GuoSongtao on 2017/2/4 14:01
 * email: 157010607@qq.com
 */

public class PrototypeTestUtils extends TestUtils{

    public PrototypeTestUtils(Activity mAct) {
        super(mAct);
    }


    /**
     *
     */
    public void  testPrototypeShallowClone(){
        try {
            Log.i("PrototypeTestUtils", "testPrototypeShallowClone: ");
            Date birthday=new Date(1996,5,24);
            ShallowCloneSheep sheep=new ShallowCloneSheep("少莉",birthday);
            ShallowCloneSheep sheepClone= (ShallowCloneSheep) sheep.clone();

            sheepClone.setSname("多莉");
            Log.i("PrototypeTestUtils", "sheep: "+sheep.toString());
            Log.i("PrototypeTestUtils", "sheepClone: "+sheepClone.toString());

            sheep.getBirthday().setYear(2017-1900);
            Log.i("PrototypeTestUtils", "sheep: "+sheep.toString());
            Log.i("PrototypeTestUtils", "sheepClone: "+sheepClone.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public void  testPrototypeDeepClone(){
        try {
            Log.i("PrototypeTestUtils", "testPrototypeDeepClone: ");
            Date birthday=new Date(1996,5,24);
            DeepCloneSheep sheep=new DeepCloneSheep("少莉",birthday);
            DeepCloneSheep sheepClone= (DeepCloneSheep) sheep.clone();

            sheepClone.setSname("多莉");
            Log.i("PrototypeTestUtils", "sheep: "+sheep.toString());
            Log.i("PrototypeTestUtils", "sheepClone: "+sheepClone.toString());

            sheep.getBirthday().setYear(2017-1900);
            Log.i("PrototypeTestUtils", "sheep: "+sheep.toString());
            Log.i("PrototypeTestUtils", "sheepClone: "+sheepClone.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    /**
     *  利用序列化和反序列化实现克隆模式
     */
    public void  testPrototypeSerializable(){
        try {
            Log.i("PrototypeTestUtils", "testPrototypeSerializable: ");
            Date birthday=new Date(1996,5,24);
            ShallowCloneSheep sheep=new ShallowCloneSheep("少莉",birthday);

            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(sheep);
            byte[] bytes=bos.toByteArray();

            ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
            ObjectInputStream ois=new ObjectInputStream(bis);
            ShallowCloneSheep sheepClone= (ShallowCloneSheep) ois.readObject();

            sheepClone.setSname("多莉");
            Log.i("PrototypeTestUtils", "sheep: "+sheep.toString());
            Log.i("PrototypeTestUtils", "sheepClone: "+sheepClone.toString());

            sheep.getBirthday().setYear(2017-1900);
            Log.i("PrototypeTestUtils", "sheep: "+sheep.toString());
            Log.i("PrototypeTestUtils", "sheepClone: "+sheepClone.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     *  测试时间消耗 由于一次时间都低于1 millis 所以使用1000次创建
     *  new 过程特别耗时时，就需要使用到原型模式
     */
    public void  testPrototypeUsedTime(){
        long startTime,endTime;
        DeepCloneSheep sheepClone;
        try {
            Date birthday=new Date(1996,5,24);
            DeepCloneSheep sheep=new DeepCloneSheep("少莉",birthday);
            startTime= System.currentTimeMillis();
            for(int i=0;i<1000;i++){
                sheepClone= (DeepCloneSheep) sheep.clone();
                sheepClone.setSname("多莉"+i);
//                sheepClone.setBirthday(new Date(1996, 5, 24));
            }
            endTime=System.currentTimeMillis();
            Log.i("PrototypeTestUtils", "testPrototypeUsedTime: "+(endTime-startTime)+" millis");

            startTime=System.currentTimeMillis();
            for(int i=0;i<1000;i++) {
                sheepClone = new DeepCloneSheep("多莉"+i, new Date(1996, 5, 24));
            }
            endTime=System.currentTimeMillis();
            Log.i("PrototypeTestUtils", "testConstructorUsedTIme: "+(endTime-startTime)+" millis");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
