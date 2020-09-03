package com.daleyzou.design.structure.bridge.manyplatform;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年09月03日 21:12
 * @version 1.3.1
 */
public class Client {
    public static void main(String[] args){
        Image image;
        ImageImp imageImp;
        image = new BMPImage();
        imageImp = new LinuxImp();
        image.setImageImp(imageImp);

        image.parseFile("dalelyzou");
    }
}
