package com.daleyzou.design.creation.builder;

/**
 * AbstractBuilder
 * @description TODO
 * @author daleyozu
 * @date 2020年07月02日 21:05
 * @version 1.2.0
 */
abstract class ActorBuilder {
    protected Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairStyle();

    public Actor createActor(){
        return actor;
    }
}
