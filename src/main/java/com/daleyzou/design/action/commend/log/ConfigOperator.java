package com.daleyzou.design.action.commend.log;

import java.io.Serializable;

/**
 * ConfigOperator
 * @description TODO
 * @author daleyzou
 * @date 2020年10月21日 22:23
 * @version 1.0.0
 */
public class ConfigOperator implements Serializable {
    public void insert(){
        System.out.println("write a log");
    }

    public void modify(){
        System.out.println("modify a log");
    }
}
