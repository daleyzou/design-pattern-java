package com.daleyzou.design.action.commend.log;

import java.io.*;
import java.util.List;

/**
 * FileUtils
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:25
 * @version 1.0.0
 */
public class FileUtils {
    public void writeCommand(List<Command> commands) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("config.log");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(fileOutputStream));
        objectOutputStream.writeObject(commands);
        objectOutputStream.close();
    }

    public List<Command> readCommand() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config.log");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Command> commands = (List<Command>) objectInputStream.readObject();
        objectInputStream.close();
        return commands;
    }
}
