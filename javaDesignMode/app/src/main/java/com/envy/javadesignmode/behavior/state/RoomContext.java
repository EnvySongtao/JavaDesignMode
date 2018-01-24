package com.envy.javadesignmode.behavior.state;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/27 17:47
 * email: 157010607@qq.com
 * 不同状态下，对象能做不同的操作，如男人：在父亲面前，就是儿子，只能被训；在妻子面前，就是挣钱的，上缴钱给妻子；在儿女面前，就是榜样，言传身教儿女.....
 */

public class RoomContext {
    private RoomState state;
    private String TAG="RoomContext";

    public void setState(RoomState state) {
        Log.i(TAG, "change room state ==> ");
        this.state = state;
        state.handle();
    }
}
