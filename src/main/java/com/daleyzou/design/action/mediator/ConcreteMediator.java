package com.daleyzou.design.action.mediator;

/**
 * ConcreteMediator
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 9:44
 * @version 1.0.0
 */
public class ConcreteMediator extends Mediator {
    private Button button;
    private Combox combox;
    private List list;
    private TextBox textBox;
    @Override
    void componentChanged(Component component) {
        if (component == button){
            System.out.println("----------add button------------");
            list.update();
            combox.update();
        }else if (component == combox){
            System.out.println("----------click combox------------");
            combox.select();
            textBox.setText();
        }else if (component == list){
            System.out.println("----------click list------------");
            combox.select();
            textBox.setText();
        }

    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setCombox(Combox combox) {
        this.combox = combox;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }
}
