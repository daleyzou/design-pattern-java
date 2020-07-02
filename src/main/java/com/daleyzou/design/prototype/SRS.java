package com.daleyzou.design.prototype;

/**
 * SRS
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 9:08
 * @version 1.2.0
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument officialDocument = null;
        try {
            officialDocument = (SRS) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return officialDocument;
    }

    @Override
    public void display() {
        System.out.println("这里是软件需求规则说明书");
    }
}
