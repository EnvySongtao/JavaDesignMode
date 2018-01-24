package com.envy.javadesignmode.create.singleton;

import android.app.Activity;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * author: GuoSongtao on 2017/1/19 17:03
 * email: 157010607@qq.com
 */

public class SingletonTest extends TestUtils{

    public SingletonTest(Activity mAct) {
        super(mAct);
    }


    public void testSingletonCreate() {

//        SingletonHungry hungry1=SingletonHungry.getInstance();
//        SingletonHungry hungry2=SingletonHungry.getInstance();
//        tv_show1.setText(hungry1.toString());
//        tv_show2.setText(hungry2.toString());

//        SingletonLazy lazy1=SingletonLazy.getInstance();
//        SingletonLazy lazy2=SingletonLazy.getInstance();
//        tv_show1.setText(lazy1.toString());
//        tv_show2.setText(lazy2.toString());


        SingletonStaticInnerClass innerClass1=SingletonStaticInnerClass.getInstance();
        SingletonStaticInnerClass innerClass2=SingletonStaticInnerClass.getInstance();
        tv_show1.setText(innerClass1.toString());
        tv_show2.setText(innerClass2.toString());

//        SingletonEnum enum1=SingletonEnum.INSTANCE;
//        SingletonEnum enum2=SingletonEnum.INSTANCE;
//        enum1.test();
//        enum2.test();
//        tv_show1.setText(enum1.toString());
//        tv_show2.setText(enum2.toString());


    }

    /**
     * 测试反射方法破解单例模式
     */
    public void testSingletonReflectCreate() {
        try {
            Class<SingletonLazy> clazz= (Class<SingletonLazy>) Class.forName("com.envy.javadesignmode.create.singleton.SingletonLazy");
            Constructor construnctor=clazz.getDeclaredConstructor(null);
            construnctor.setAccessible(true);//设置权限可获取，私有的同样可以访问
            SingletonLazy lazy3= (SingletonLazy) construnctor.newInstance();
            SingletonLazy lazy4= (SingletonLazy) construnctor.newInstance();
            tv_show1.setText(lazy3.toString());
            tv_show2.setText(lazy4.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 通过反序列化 破解单例模式
     */
    public void testDeserializeSingletonCreate(){

        SingletonLazy lazy1=SingletonLazy.getInstance();
        try {

            String fileName=Environment.getExternalStorageDirectory()+"/javamodetest/singletonLazy.txt";
            File file=new File(fileName);
            File filePath=file.getParentFile();
            if(!filePath.exists()){
                Log.i("test","filePath.mkdirs()="+filePath.mkdirs());
            }
            file.createNewFile();

            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(lazy1);
            oos.close();
            fos.close();

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            SingletonLazy lazy2= (SingletonLazy) ois.readObject();
            tv_show1.setText(lazy1.toString());
            tv_show2.setText(lazy2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
