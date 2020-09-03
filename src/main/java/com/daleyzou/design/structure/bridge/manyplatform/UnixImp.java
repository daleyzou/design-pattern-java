
package com.daleyzou.design.structure.bridge.manyplatform;

/**
 * UnixImp
 * @description TODO
 * @author daleyzou
 * @date 2020年09月03日 21:01
 * @version 1.3.1
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Unix");
    }
}
