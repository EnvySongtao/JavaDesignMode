package com.envy.javadesignmode.behavior.observerMode;

/**
 * author: GuoSongtao on 2017/1/18 17:39
 * email: 157010607@qq.com
 */
public interface MyDownloadObserver {
    void updateProgress(MyDownloadObservable observable, float percent);
    void updateStatus(MyDownloadObservable observable,int status);

}
