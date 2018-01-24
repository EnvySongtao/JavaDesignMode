package com.envy.javadesignmode.structure.composite;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/2/7 15:31
 * email: 157010607@qq.com
 */

public class CompositeTestUtils extends TestUtils{

    public CompositeTestUtils(Activity mAct) {
        super(mAct);
    }

    /**
     * 测试静态代理
     */
    public void testComposite(){
        Folder folder1=new Folder("我的收藏");
        TextFile txt1=new TextFile("readme.txt");
        TextFile txt11=new TextFile("setting.txt");
        folder1.addFile(txt1);
        folder1.addFile(txt11);

        Folder folder2=new Folder("我的视频");
        VideoFile video= new VideoFile("让子弹飞.MP4");
        TextFile txt2=new TextFile("视频解压密码.txt");
        folder2.addFile(video);
        folder2.addFile(txt2);

        Folder folder3=new Folder("我的表情");
        ImageFile image1=new ImageFile("我的表情1.jpg");
        ImageFile image2=new ImageFile("我的表情2.jpg");
        ImageFile image3=new ImageFile("我的表情3.jpg");
        folder3.addFile(image1);
        folder3.addFile(image2);
        folder3.addFile(image3);

        folder1.addFile(folder2);
        folder1.addFile(folder3);

        folder1.killVirus();
    }

}
