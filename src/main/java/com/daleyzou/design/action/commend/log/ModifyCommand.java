package com.daleyzou.design.action.commend.log;

/**
 * ModifyCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:23
 * @version 1.0.0
 */
public class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify();
    }

    @Override
    public void execute() {
        this.execute(this.args);
    }
}
