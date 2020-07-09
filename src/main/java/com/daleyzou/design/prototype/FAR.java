package com.daleyzou.design.prototype;

/**
 * FAR
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月02日 9:05
 * @version 1.2.0
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument officialDocument = null;
        try {
            officialDocument = (FAR)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return officialDocument;
    }

    @Override
    public void display() {
        System.out.println("这里是可行性分析报告");
    }
}
