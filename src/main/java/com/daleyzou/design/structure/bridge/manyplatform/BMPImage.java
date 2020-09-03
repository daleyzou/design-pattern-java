package com.daleyzou.design.structure.bridge.manyplatform;

/**
 * BMPImage
 * @description TODO
 * @author daleyzou
 * @date 2020年09月03日 20:58
 * @version 1.3.1
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        this.imageImp.doPaint(matrix);
        System.out.println("BMP");
    }
}
