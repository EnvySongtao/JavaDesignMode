package com.envy.javadesignmode.behavior.iterator;

/**
 * author: GuoSongtao on 2017/2/20 15:51
 * email: 157010607@qq.com
 */

public interface MyIterator {

    /**
     * 跳到起始位置
     * @return
     */
    void toFrist();
    /**
     * 跳到下一个
     * @return
     */
    void toNext();

    /**
     * 是否拥有下一个对象
     * @return
     */
    boolean hasNext();

    /**
     * 当前是否是第一个
     * @return
     */
    boolean isFrist();

    /**
     * 当前是否是最后一个
     * @return
     */
    boolean isLast();

    /**
     * 获取当前对象
     * @return
     */
    Object getCurrentObject();

}
