package com.daleyzou.design.structure.composite;

/**
 * ImageFile
 * @description TODO
 * @author daleyzou
 * @date 2020年09月08日 9:41
 * @version 1.3.1
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    @Override
    public AbstractFile getChild(int i) {
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对图片文件---" + this.name + "--- 进行杀毒");
    }
}
