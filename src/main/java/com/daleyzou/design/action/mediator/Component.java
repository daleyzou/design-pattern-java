package com.daleyzou.design.action.mediator;

/**
 * Component
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 9:42
 * @version 1.0.0
 */
public abstract class Component {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(){
        this.mediator.componentChanged(this);
    }
    public abstract void update();
}
