package com.daleyzou.design.creation.builder;

/**
 * HeroBuilder
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 21:08
 * @version 1.2.0
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setSex("圆脸");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("裙子");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairstyle("长发");
    }
}
