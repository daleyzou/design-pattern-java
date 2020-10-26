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
    String name;
    String args;
    ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getArgs() {
        return args;
    }

    public ConfigOperator getConfigOperator() {
        return configOperator;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute(String args);
    public abstract void execute();

}
