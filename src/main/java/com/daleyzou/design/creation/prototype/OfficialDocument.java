package com.daleyzou.design.creation.prototype;

/**
 * OfficialDocument
 * @description TODO
 * @author daleyzuo
 * @date 2020年07月02日 9:03
 * @version 1.2.0
 */
public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();
    void display();
}
