package com.envy.javadesignmode.behavior.command;

/**
 * 具体命令（ConcreteCommand）：具体命令，实现要执行的方法，
 * 它通常是“虚”的实现；通常会有接收者，并调用接收者的功能来完成命令要执行的操作。
 * author: GuoSongtao on 2017/2/24 17:58
 * email: 157010607@qq.com
 */

public class MoneyOutCommand implements Command {

    private Account account;
    private double amount;

    public MoneyOutCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.moneyOut(amount);
    }

}
