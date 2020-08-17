package com.daleyzou.design.creation.builder;

/**
 * ActorController
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 21:12
 * @version 1.2.0
 */
public class ActorController {
    public Actor actorBuilder(ActorBuilder actorBuilder){
        actorBuilder.buildType();
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildHairStyle();
        actorBuilder.buildSex();
        return actorBuilder.createActor();
    }
}
