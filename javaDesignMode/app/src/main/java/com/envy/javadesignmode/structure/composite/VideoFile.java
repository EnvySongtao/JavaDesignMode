package com.envy.javadesignmode.structure.composite;

import android.util.Log;

/**
 * 组合模式中的Leaf实现了component
 * author: GuoSongtao on 2017/2/10 14:26
 * email: 157010607@qq.com
 */
public class VideoFile implements AbstractFile{
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        Log.i("VideoFile", "is killing Virus to video file : "+ name);
    }
}
