package com.daleyzou.design.prototype;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 9:19
 * @version 1.2.0
 */
public class Client {
    public static void main(String[] args){
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();
        OfficialDocument sas = prototypeManager.getPrototype("sas");
        sas.display();
        OfficialDocument far = prototypeManager.getPrototype("far");
        far.display();
    }
}
