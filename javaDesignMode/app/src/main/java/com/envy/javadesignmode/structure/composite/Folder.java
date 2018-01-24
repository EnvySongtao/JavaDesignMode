package com.envy.javadesignmode.structure.composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式中的composte,不仅实现了component，而且拥有包含Leaf的作用
 * 所以还会拥有 addLeaf（Component leaf）, removeLeaf（Component leaf）, getChild（int i）等方法
 * author: GuoSongtao on 2017/2/10 14:26
 * email: 157010607@qq.com
 */
public class Folder implements AbstractFile{
    private String name;
    private List<AbstractFile> files;

    public Folder(String name) {
        this.name = name;
        files=new ArrayList<>();
    }

    public void addFile(AbstractFile file){
        files.add(file);
    }

    public void removeFile(AbstractFile file){
        files.remove(file);
    }

    public AbstractFile getChildFile(int index){
        return files.get(index);
    }

    @Override
    public void killVirus() {
        Log.i("Folder", "is killing Virus to folder : "+ name);
        if(files!=null&&!files.isEmpty()){
            for(AbstractFile file:files){
                file.killVirus();
            }
        }
    }

}
