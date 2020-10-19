package com.daleyzou.design.action.commend.calculator;

/**
 * AddCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年10月14日 21:59
 * @version 1.0.0
 */
public class AddCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;
    @Override
    public int execute(int value) {
        this.value = value;
        return this.adder.add(value);
    }

    @Override
    public int undo() {
        return this.adder.add(-this.value);
    }
}
