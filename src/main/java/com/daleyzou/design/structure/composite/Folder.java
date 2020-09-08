package com.daleyzou.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Folder
 * @description TODO
 * @author daleyzou
 * @date 2020年09月08日 9:42
 * @version 1.3.1
 */
public class Folder extends AbstractFile {
    private String name;

    private List<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹---" + this.name + "--- 进行杀毒");
        this.fileList.forEach(AbstractFile::killVirus);
    }
}
