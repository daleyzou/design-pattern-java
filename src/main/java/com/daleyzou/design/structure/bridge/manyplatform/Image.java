package com.daleyzou.design.structure.bridge.manyplatform;

/**
 * Image
 * @description TODO
 * @author daleyzou
 * @date 2020年09月03日 20:53
 * @version 1.3.1
 */
public abstract class Image {
    protected ImageImp imageImp;

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract void parseFile(String fileName);
}
