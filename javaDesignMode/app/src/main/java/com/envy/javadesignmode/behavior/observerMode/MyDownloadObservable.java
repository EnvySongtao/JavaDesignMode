package com.envy.javadesignmode.behavior.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * author: GuoSongtao on 2017/1/18 17:38
 * email: 157010607@qq.com
 */

public class MyDownloadObservable {
    private static final int STATUS_UNDOWNLOAD=0x000;//初始(initial)，未下载
    private static final int STATUS_IS_DOWNLOADING=0x001;//正在下载
    private static final int STATUS_STOP_DOWNLOADING=0x002;//停止
    private static final int STATUS_COMPLETED=0x003;//完成

    List<MyDownloadObserver> observerList=new ArrayList<>();

    public void addDownloadObserver(MyDownloadObserver observer){
        if(observer==null){
            throw new NullPointerException("the object of MyDownloadObserver is null !");
        }else{
            observerList.add(observer);
        }
    }

    public void removeDownloadObserver(MyDownloadObserver observer){
        if(observer==null){
            throw new NullPointerException("the object of MyDownloadObserver is null !");
        }else{
            observerList.remove(observer);
        }
    }

    /**
     * 复制一次是为了防止在遍历过程中，有MyDownloadObserver被移除的情况
     * @param percent
     */
    private void notifyDataChange(float percent) {
        MyDownloadObserver[] observers=null;
        if(!observerList.isEmpty()) {
            synchronized (this){
                observers = observerList.toArray(new MyDownloadObserver[observerList.size()]);
            }
        }
        for(MyDownloadObserver bean:observers){
            bean.updateProgress(this,percent);
            if(percent>=1){
                bean.updateStatus(this,STATUS_COMPLETED);
            }else if(percent<=0){
                bean.updateStatus(this,STATUS_UNDOWNLOAD);
            }else{

            }
        }

    }

    /*以下测试使用和模式无关*/
    public void start(){
        resetmThread();
        if(!mThread.isAlive()){
            percent=-0.1f;
            mThread.start();
        }
    }

    public float percent=0f;
    private Thread mThread = null;

    void resetmThread(){
        mThread = new Thread() {
            @Override
            public void run() {

                do {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    percent += 0.1f;
                    notifyDataChange(percent);
                } while (percent >= -0.1F && percent <= 1);
            }
        };
    }


}
