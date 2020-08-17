package com.daleyzou.design.creation.singleton;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年07月01日 21:23
 * @version 1.2.0
 */
public class Client {
    public static void main(String[] args){
        LoadBalance instance1 = LoadBalance.getInstance();
        LoadBalance instance2 = LoadBalance.getInstance();
        LoadBalance instance3 = LoadBalance.getInstance();
        LoadBalance instance4 = LoadBalance.getInstance();
        LoadBalance instance5 = LoadBalance.getInstance();
        LoadBalance instance6 = LoadBalance.getInstance();

        if (instance1 == instance2){
            System.out.println("静态方法创建出来的都是一样的");
        }

        for (int i = 0; i < 10; i++){
            instance1.addServer(String.valueOf(i));
        }


        for (int i = 0; i < 30; i++){
            String server = instance1.getServer();
            System.out.println("当前server: " + server);
        }
    }
}
