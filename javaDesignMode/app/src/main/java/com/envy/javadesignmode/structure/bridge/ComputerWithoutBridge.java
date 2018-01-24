package com.envy.javadesignmode.structure.bridge;

import android.util.Log;

/**
 * 每增加一个品牌或者电脑类型，都要增加多个类
 * author: GuoSongtao on 2017/2/10 11:18
 * email: 157010607@qq.com
 *
 */
public abstract class ComputerWithoutBridge {
    protected  String TAG="ComputerWithoutBridge";
    public abstract void  sell();
}

abstract class DesktopComputer extends ComputerWithoutBridge{

}

class LenovoDesktopComputer extends DesktopComputer{
    @Override
    public void sell() {
        Log.i(TAG, "sell: lenovo desktop computer");
    }
}
class DellDesktopComputer extends DesktopComputer{

    @Override
    public void sell() {
        Log.i(TAG, "sell: dell desktop computer");
    }
}
class AsusDesktopComputer extends DesktopComputer{
    @Override
    public void sell() {
        Log.i(TAG, "sell: asus desktop computer");
    }
}

abstract class BookComputer extends ComputerWithoutBridge{

}

class LenovoBookComputer extends BookComputer{
    @Override
    public void sell() {
        Log.i(TAG, "sell: lenovo book computer");
    }
}
class DellBookComputer extends BookComputer{
    @Override
    public void sell() {
        Log.i(TAG, "sell: dell book computer");
    }
}
class AsusBookComputer extends BookComputer{
    @Override
    public void sell() {
        Log.i(TAG, "sell: asus book computer");
    }
}

/**
 * 比如新增pad类型时 需要新增各品牌的電腦
 */
//abstract class PadComputer extends ComputerWithoutBridge{
//
//}
//
//class LenovoPadComputer extends PadComputer{
//    @Override
//    public void sell() {
//        Log.i(TAG, "sell: lenovo pad computer");
//    }
//}
//class DellPadComputer extends PadComputer{
//    @Override
//    public void sell() {
//        Log.i(TAG, "sell: dell pad computer");
//    }
//}
//class AsusPadComputer extends PadComputer{
//    @Override
//    public void sell() {
//        Log.i(TAG, "sell: asus pad computer");
//    }
//}