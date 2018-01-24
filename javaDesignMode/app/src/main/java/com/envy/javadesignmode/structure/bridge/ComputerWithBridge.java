package com.envy.javadesignmode.structure.bridge;

import android.util.Log;

/**
 * author: GuoSongtao on 2017/2/10 11:40
 * email: 157010607@qq.com
 */

public abstract class ComputerWithBridge {
    protected static final String TAG="ComputerWithBridge";
    protected BrandWithBridge brand;

    public ComputerWithBridge(BrandWithBridge brand) {
        this.brand = brand;
    }

    void sell(){
        this.brand.sell();
    }
}

class DesktopComputer1 extends ComputerWithBridge{
    public DesktopComputer1(BrandWithBridge brand) {
        super(brand);
    }

    @Override
    void sell() {
        super.sell();
        Log.i(TAG, "sell: desktop computer");
    }
}

class BookComputer1 extends ComputerWithBridge{
    public BookComputer1(BrandWithBridge brand) {
        super(brand);
    }

    @Override
    void sell() {
        super.sell();
        Log.i(TAG, "sell: book computer");
    }
}
class PadComputer1 extends ComputerWithBridge{
    public PadComputer1(BrandWithBridge brand) {
        super(brand);
    }

    @Override
    void sell() {
        super.sell();
        Log.i(TAG, "sell: pad computer");
    }
}