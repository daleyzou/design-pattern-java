package com.daleyzou.design.action.commend.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfigSettingWindow
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:25
 * @version 1.0.0
 */
public class ConfigSettingWindow {
    List<Command> commandList = new ArrayList<>();

    public void call(Command command){
        command.execute("args1");
        commandList.add(command);
    }

    public void save() throws IOException {
        FileUtils.writeCommand(commandList);
    }

    public void recovery() throws IOException, ClassNotFoundException {
        List<Command> commands = FileUtils.readCommand();
        for (Command command : commands) {
            command.execute();
        }
    }
}
