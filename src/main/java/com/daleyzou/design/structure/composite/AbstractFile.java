package com.daleyzou.design.structure.composite;

/**
 * AbstractFile
 * @description TODO
 * @author daleyzou
 * @date 2020年09月08日 9:38
 * @version 1.3.1
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
