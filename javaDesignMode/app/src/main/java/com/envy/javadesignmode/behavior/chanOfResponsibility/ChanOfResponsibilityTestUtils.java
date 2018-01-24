package com.envy.javadesignmode.behavior.chanOfResponsibility;

import android.app.Activity;
import android.media.Image;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;
import com.envy.javadesignmode.behavior.observerMode.MyDownloadObservable;
import com.envy.javadesignmode.behavior.observerMode.MyDownloadObserver;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class ChanOfResponsibilityTestUtils extends TestUtils{

    public ChanOfResponsibilityTestUtils(Activity mAct) {
        super(mAct);
    }


    public void test() {

        Leader director=new Director("张三");
        Leader manager=new Manager("李四");
        Leader viceGeneralManager=new ViceGeneralManager("王二嫂");
        Leader generalManager=new GeneralManager("王二");

        //组织责任链的关系
        director.setNextLeader(manager);
        manager.setNextLeader(viceGeneralManager);
        viceGeneralManager.setNextLeader(generalManager);

        LeaveRequest request=new LeaveRequest("小明",14,"开车撞断了大腿！");
        director.handleRequest(request);
    }

}
