package com.daleyzou.design.action.commend.selfbutton;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年09月29日 19:30
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        SettingWindow settingWindow = new SettingWindow("功能键设置");
        FunctionButton functionButton1, functionButton2;
        functionButton1 = new FunctionButton("功能键1");
        functionButton2 = new FunctionButton("功能键2");

        Command command1, command2;
        command1 = new MinimizeCommand();
        command2 = new HelpCommand();

        functionButton1.setCommand(command1);
        functionButton2.setCommand(command2);

        settingWindow.addFunctionButton(functionButton1);
        settingWindow.addFunctionButton(functionButton2);
        settingWindow.display();

        functionButton1.onClick();
        functionButton2.onClick();

    }
}
