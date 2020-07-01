package com.daleyzou.design.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * LoadBalance
 * @description TODO
 * @author daleyzou
 * @date 2020年07月01日 21:19
 * @version 1.2.0
 */
public class LoadBalance {
    List<String> serverList;
    static LoadBalance loadBalance = null;
    public static LoadBalance getInstance(){
        if (loadBalance == null){
            loadBalance = new LoadBalance();
        }
        return loadBalance;
    }
    private LoadBalance() {
        serverList = new ArrayList<>();
    }

    public void addServer(String name){
        serverList.add(name);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return serverList.get(i);
    }
}
