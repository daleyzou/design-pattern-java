package com.daleyzou.design.action.commend.log;

/**
 * InsertCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:23
 * @version 1.0.0
 */
public class InsertCommand extends Command {
    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert();
    }

    @Override
    public void execute() {
        this.execute(this.args);
    }
}
