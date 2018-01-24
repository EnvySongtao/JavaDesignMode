package com.envy.javadesignmode.behavior.state;

import android.app.Activity;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class StateTestUtils extends TestUtils{

    public StateTestUtils(Activity mAct) {
        super(mAct);
    }

    public void test() {
        RoomContext mRCtx=new RoomContext();
        mRCtx.setState(new RoomFreeState());
        mRCtx.setState(new RoomBookedState());
        mRCtx.setState(new RoomCheckedInState());
    }

}
