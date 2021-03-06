package com.daleyzou.design.action.commend.selfbutton;

/**
 * HelpCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年09月28日 22:21
 * @version 1.0.0
 */
public class HelpCommand extends Command {
    HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
