package com.daleyzou.design.structure.decorator;

/**
 * ComponentDecorator
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 20:27
 * @version 1.0.0
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        this.component.display();
    }
}
