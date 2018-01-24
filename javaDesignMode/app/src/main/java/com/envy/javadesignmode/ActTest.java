package com.envy.javadesignmode;

import android.app.Activity;
import android.os.Bundle;

import com.envy.javadesignmode.behavior.memento.MementoTestUtils;
import com.envy.javadesignmode.behavior.state.StateTestUtils;
import com.envy.javadesignmode.behavior.template.TemplateMothedTestUtils;
import com.envy.javadesignmode.structure.decorator.DecoratorTestUtils;

/**
 * author: GuoSongtao on 2017/1/18 16:20
 * email: 157010607@qq.com
 */

public class ActTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*创建型模式 start*/
        //单例模式测试
//        new SingletonTest(this).testSingletonCreate();
//        new SingletonTest(this).testSingletonReflectCreate();//测试反射方法破解单例模式
//        new SingletonTest(this).testDeserializeSingletonCreate();//测试反序列方法破解单例模式
        //工厂模式测试
//        new FactoryTestUtils(this).testFactoryMode();
//        new FactoryTestUtils(this).testCarFactory2Mode();//是testFactoryMode另一种实现
//        new FactoryTestUtils(this).testCarFactoryMethodMode();//工厂方法模式
//        new FactoryTestUtils(this).testCarAbstractFactory();//抽象工厂
        //创建者模式
//        new BuilderTestUtils(this).testBuilderMode();
        //原型模式
//        new PrototypeTestUtils(this).testPrototypeDeepClone();
//        new PrototypeTestUtils(this).testPrototypeShallowClone();
//        new PrototypeTestUtils(this).testPrototypeSerializable();
//        new PrototypeTestUtils(this).testPrototypeUsedTime();
        /*创建型模式 end*/

        /*结构型模式 start*/
        //设配器模式
//        new AdapterTestUtils(this).testObjectAdapter();
        //代理模式
//        new ProxyTestUtils(this).testStaticProxy();
//        new ProxyTestUtils(this).testDynamicProxy();
        //橋接模式 橋梁模式
//        new BridgeTestUtils(this).testComputerWithBridge();
        //组合模式 主要适用于 树状数据的处理（如 文件夹扫描）
//        new CompositeTestUtils(this).testComposite();
//        装饰模式（decorator）或者包装模式（wrapper） 对现实类不停的添加小功能 如墙，贴纸，刷漆，装灯，贴画等
        new DecoratorTestUtils(this).testDecorator();
        //外观模式（facade） 包装成工具类的步骤
//        new FacadeTestUtils(this).testFacade();
        //享元模式（Flyweight）
//        new FlyweightTestUtils(this).testFlyweight();
        /*结构型模式 end*/

        /*行为模式 start*/
        //观察者模式测试
//        new ObserverTest(this).testObserver();
        //责任链模式（Chan of Responsibility） try catch
//        new ChanOfResponsibilityTestUtils(this).test();
//        //迭代器模式（Iterator）  set list
//        new IteratorTestUtils(this).test();
        //中介者模式（Mediator）
//        new MediatorTestUtils(this).testMediator();
        //命令模式（Mediator）
//        new CommandTestUtils(this).test();
        //策略模式（Strategy） 常见例子：ViewGroup的子类 LinearLayout FrameLayout等
//        new StartegyTestUtils(this).test();
        //模板方法模式（template mothed）
//        new TemplateMothedTestUtils(this).test();
        //状态方法模式（state mothed）
//        new StateTestUtils(this).test();
//        //备忘录模式（memento）
//        new MementoTestUtils(this).test();
        /*行为模式 end*/
    }
}
