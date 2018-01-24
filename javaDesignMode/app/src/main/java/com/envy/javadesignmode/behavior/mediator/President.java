package com.envy.javadesignmode.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * author: GuoSongtao on 2017/2/21 18:29
 * email: 157010607@qq.com
 */

public class President implements Mediator {

    private Map<String,DepartMent> departMentMaps=new HashMap<>();
    @Override
    public void command(String action) {
        if(departMentMaps.get(action)!=null){
            departMentMaps.get(action).selfAction(action);
        }
    }

    @Override
    public void register(String request, DepartMent departMent) {
        departMentMaps.put(request,departMent);
    }
}
