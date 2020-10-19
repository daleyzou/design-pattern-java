package com.daleyzou.design.action.commend.calculator;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年10月19日 22:11
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        AbstractCommand command = new AddCommand();
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setCommand(command);

        calculatorForm.compute(5);
        calculatorForm.compute(10);
        calculatorForm.compute(15);
        calculatorForm.undo();
    }
}
