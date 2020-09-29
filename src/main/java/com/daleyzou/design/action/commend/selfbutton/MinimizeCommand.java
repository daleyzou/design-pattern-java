package com.daleyzou.design.action.commend.selfbutton;

/**
 * MinimizeCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年09月28日 22:21
 * @version 1.0.0
 */
public class MinimizeCommand extends Command {
    WindowHandler windowHandler;

    public MinimizeCommand() {
        this.windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
