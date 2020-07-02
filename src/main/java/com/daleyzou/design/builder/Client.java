package com.daleyzou.design.builder;

import com.daleyzou.design.XmlUtil;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 21:28
 * @version 1.2.0
 */
public class Client {
    public static void main(String[] args){
        ActorBuilder ab;
        ab = (ActorBuilder) XmlUtil.getBean();
        ActorController ac = new ActorController();
        Actor actor = ac.actorBuilder(ab);
        System.out.println(actor.getType());
    }
}
