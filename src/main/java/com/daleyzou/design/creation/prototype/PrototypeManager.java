package com.daleyzou.design.creation.prototype;

import java.util.concurrent.ConcurrentHashMap;

/**
 * PrototypeManager
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 9:13
 * @version 1.2.0
 */
public class PrototypeManager {
    private ConcurrentHashMap<String, OfficialDocument> map = new ConcurrentHashMap<>();
    static PrototypeManager prototypeManager = new PrototypeManager();
    private PrototypeManager(){
        map.put("far", new FAR());
        map.put("sas", new SRS());
    }

    public void addPrototype(String name, OfficialDocument officialDocument){
        map.put(name, officialDocument);
    }

    public OfficialDocument getPrototype(String name){
        OfficialDocument clone = map.get(name).clone();
        return clone;
    }

    public static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }
}
