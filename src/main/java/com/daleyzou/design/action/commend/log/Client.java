package com.daleyzou.design.action.commend.log;

import java.io.IOException;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:26
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();
        ConfigOperator configOperator = new ConfigOperator();
        Command command1 = new InsertCommand("insert");
        Command command2 = new InsertCommand("insert");
        Command command3 = new ModifyCommand("modify");

        command1.setConfigOperator(configOperator);
        command2.setConfigOperator(configOperator);
        command3.setConfigOperator(configOperator);

        configSettingWindow.setCommand(command1);
        configSettingWindow.call("网站首页");
        configSettingWindow.setCommand(command2);
        configSettingWindow.call("网站菜单");
        configSettingWindow.setCommand(command3);
        configSettingWindow.call("网站首页");

        configSettingWindow.save();
    }
}
