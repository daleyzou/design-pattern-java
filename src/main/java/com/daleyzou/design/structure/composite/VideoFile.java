package com.daleyzou.design.structure.composite;

/**
 * VideoFile
 * @description TODO
 * @author daleyzou
 * @date 2020年09月08日 9:42
 * @version 1.3.1
 */
public class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
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
        System.out.println("对视频文件---" + this.name + "--- 进行杀毒");
    }
}
