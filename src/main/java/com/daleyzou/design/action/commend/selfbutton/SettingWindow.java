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
    ArrayList<FunctionButton> functionButtons = new ArrayList<>();

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
        functionButtons.add(functionButton);
    }
    public void removeFunctionButton(FunctionButton functionButton){
        functionButtons.remove(functionButton);
    }
    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (FunctionButton functionButton : functionButtons) {
            System.out.println(functionButton.getName());
        }
        System.out.println("------------------------------");
    }
}
