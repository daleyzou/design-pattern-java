package com.daleyzou.design.creation.singleton;

/**
 * TaskManager
 * @description TODO
 * @author daleyzou
 * @date 2020年07月01日 21:13
 * @version 1.2.0
 */
public class TaskManager {
    static TaskManager tm = null;
    private TaskManager() {
    }

    public static TaskManager getInstance(){
        if (tm == null){
            tm = new TaskManager();
        }
        return tm;
    }
}
