package com.daleyzou.design.action.state.share;

/**
 * Switch
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 21:46
 * @version 1.0.0
 */
public class Switch {
    private static State state;
    private static State onState;
    private static State offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        state = onState;
    }

    public void setState(State state) {
        Switch.state = state;
    }

    public static State getState(String stateType) {
        if (stateType.equalsIgnoreCase("on")){
            return onState;
        }else {
            return offState;
        }
    }

    public void on(){
        System.out.printf(this.name);
        state.on(this);
    }

    public void off(){
        System.out.printf(this.name);
        state.off(this);
    }

}
