package com.envy.javadesignmode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的混合聚集体
 * concrete
 * 具体的，有形的，实在的，实际的;固结成的，混凝土制的;图案诗歌的  混凝土;具体物;（图案式）有形诗;〔建〕钢筋混凝土
 * 使凝固;用混凝土修筑;萃取  凝固;固结;变坚固;使用混凝土
 *
 * aggregate
 * 骨料;合计;聚集体;集料（可成混凝土或修路等用的） 总数的，总计的;聚合的;[地]聚成岩的 使聚集，使积聚;总计达
 *
 * author: GuoSongtao on 2017/2/20 16:07
 * email: 157010607@qq.com
 */
public class ConcreteMyAggregate {
    private List<Object> objectList=new ArrayList<>();

    public ConcreteMyAggregate() {
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public MyIterator getIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator{
        private int cursor=0;//定义游标 用于记录遍历位置
        @Override
        public void toFrist() {
            cursor=0;
        }

        @Override
        public void toNext() {
            cursor++;
        }

        @Override
        public boolean hasNext() {
            if(cursor<objectList.size()){
                return true;
            }
            return false;
        }

        @Override
        public boolean isFrist() {
            return cursor==0?true:false;
        }

        @Override
        public boolean isLast() {
            return cursor==objectList.size()-1?true:false;
        }

        @Override
        public Object getCurrentObject() {
            return objectList.get(cursor);
        }
    }
}
