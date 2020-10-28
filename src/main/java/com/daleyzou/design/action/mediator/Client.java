package com.daleyzou.design.action.mediator;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 10:02
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Button addButton = new Button();
        List showList = new List();
        Combox combox = new Combox();
        TextBox userNameTextBox = new TextBox();

        addButton.setMediator(mediator);
        showList.setMediator(mediator);
        combox.setMediator(mediator);
        userNameTextBox.setMediator(mediator);

        mediator.setButton(addButton);
        mediator.setCombox(combox);
        mediator.setList(showList);
        mediator.setTextBox(userNameTextBox);

        addButton.changed();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        showList.changed();
    }
}
