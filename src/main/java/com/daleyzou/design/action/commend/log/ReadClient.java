package com.daleyzou.design.action.commend.log;

import java.io.IOException;

/**
 * ReadClient
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 20:04
 * @version 1.0.0
 */
public class ReadClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();

        configSettingWindow.recovery();
    }
}
