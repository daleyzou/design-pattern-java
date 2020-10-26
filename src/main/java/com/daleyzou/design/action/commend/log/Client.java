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
        Command command1 = new InsertCommand("insert1");
        Command command2 = new InsertCommand("insert2");
        Command command3 = new ModifyCommand("modify 1");

        command1.setConfigOperator(configOperator);
        command2.setConfigOperator(configOperator);
        command3.setConfigOperator(configOperator);

        configSettingWindow.call(command1);
        configSettingWindow.call(command2);
        configSettingWindow.call(command3);

        configSettingWindow.save();
    }
}
