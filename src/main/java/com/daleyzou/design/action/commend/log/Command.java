package com.daleyzou.design.action.commend.log;

import java.io.Serializable;

/**
 * Command
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:20
 * @version 1.0.0
 */
public abstract class Command implements Serializable {
    public abstract void execute(String args);
    public abstract void execute();

}
