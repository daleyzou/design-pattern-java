package com.daleyzou.design.action.commend.selfbutton;

import java.util.ArrayList;

/**
 * SettingWindow
 * @description TODO
 * @author daleyzou
 * @date 2020年09月28日 22:25
 * @version 1.0.0
 */
public class SettingWindow {
    String title;
    ArrayList<FunctionButton> functionButtons;

    public SettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addFunctionButton(FunctionButton functionButton){

    }
    public void removeFunctionButton(FunctionButton functionButton){

    }
    public void display(){

    }
}
