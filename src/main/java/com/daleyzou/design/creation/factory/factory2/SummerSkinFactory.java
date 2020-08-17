package com.daleyzou.design.creation.factory.factory2;

/**
 * SummerSkinFactory
 * @description TODO
 * @author daleyzou
 * @date 2020年06月30日 21:12
 * @version 1.2.0
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboxBox createComboxBox() {
        return null;
    }

    @Override
    public TextField createTextField() {
        return null;
    }
}
