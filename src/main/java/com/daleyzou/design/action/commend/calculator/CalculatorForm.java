package com.daleyzou.design.action.commend.calculator;

/**
 * CalculatorForm
 * @description TODO
 * @author daleyzou
 * @date 2020年10月14日 21:55
 * @version 1.0.0
 */
public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int executeValue = this.command.execute(value);
        System.out.println("calcute result: " + executeValue);
    }

    public void undo() {
        int undoValue = this.command.undo();
        System.out.println("undo result: " + undoValue);
    }

}
