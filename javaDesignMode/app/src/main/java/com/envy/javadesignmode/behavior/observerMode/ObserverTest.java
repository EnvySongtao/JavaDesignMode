package com.envy.javadesignmode.behavior.observerMode;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.envy.javadesignmode.R;
import com.envy.javadesignmode.TestUtils;

import junit.framework.Test;

/**
 * author: GuoSongtao on 2017/1/19 15:18
 * email: 157010607@qq.com
 */

public class ObserverTest extends TestUtils {
    private MyDownloadObservable observable;
    private MyDownloadObserver observer1,observer2;


    public ObserverTest(Activity mAct) {
        super(mAct);
    }


    public void testObserver() {
        mAct.setContentView(R.layout.act_test);
        tv_show1= (TextView) mAct.findViewById(R.id.tv_show1);
        tv_show2= (TextView) mAct.findViewById(R.id.tv_show2);
        btn_test= (TextView) mAct.findViewById(R.id.btn_test);
        observable=new MyDownloadObservable();
        observer1= new MyDownloadObserver(){
            @Override
            public void updateProgress(MyDownloadObservable observable, float percent) {
                //只能在主线程更新UI
//                tv_show1.setText("观察者1显示进度："+percent);
                Log.i("ActTest","观察者1显示进度："+percent);
            }
            @Override
            public void updateStatus(MyDownloadObservable observable, int status) {
//                tv_show1.setText("观察者1的状态："+status);
                Log.i("ActTest","观察者1的状态："+status);
            }
        };
        observer2= new MyDownloadObserver(){
            @Override
            public void updateProgress(MyDownloadObservable observable, float percent) {
//                tv_show1.setText("观察者2显示进度："+percent);
                Log.i("ActTest","观察者2显示进度："+percent);
            }
            @Override
            public void updateStatus(MyDownloadObservable observable, int status) {
//                tv_show1.setText("观察者2的状态："+status);
                Log.i("ActTest","观察者2的状态："+status);
            }
        };
        observable.addDownloadObserver(observer1);
        observable.addDownloadObserver(observer2);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observable.start();
            }
        });
    }
}
