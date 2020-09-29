package com.daleyzou.design.action.commend.selfbutton;

/**
 * FunctionButton
 * @description TODO
 * @author daleyzou
 * @date 2020年09月28日 22:23
 * @version 1.0.0
 */
public class FunctionButton {
    Command command;
    String name;

    public FunctionButton(String name) {
        this.name = name;
    }

    public void onClick() {
        System.out.println("点击功能键：");
        command.execute();
    }

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
