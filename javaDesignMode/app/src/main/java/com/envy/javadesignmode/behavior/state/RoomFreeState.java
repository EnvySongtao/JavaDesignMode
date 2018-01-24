package com.envy.javadesignmode.behavior.state;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/27 17:42
 * email: 157010607@qq.com
 */

public class RoomFreeState implements RoomState {

    private String TAG="RoomState";

    @Override
    public void handle() {
        Log.i(TAG, "Room is free,wait to be booked!");
    }
}
