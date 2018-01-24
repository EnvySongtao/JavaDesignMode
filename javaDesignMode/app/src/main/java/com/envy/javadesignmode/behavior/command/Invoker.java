package com.envy.javadesignmode.behavior.command;

/**
 * author: GuoSongtao on 2017/2/24 18:10
 * email: 157010607@qq.com
 */

public class Invoker {
    private Command command;//也可以是命令集合

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        this.command.execute();
    }
}
