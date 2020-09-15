package com.daleyzou.design.structure.proxy.demo2;

/**
 * ProxySearcher
 * @description TODO
 * @author daleyzou
 * @date 2020年09月15日 22:07
 * @version 1.0.0
 */
public class ProxySearcher implements Searcher {
    private RealSearcher realSearcher;

    private AccessValidator accessVaildator;

    private LoggerUtil logger;

    @Override
    public void doSearch(String userId, String keyword) {

    }

    public boolean validate(String userId) {
        return false;
    }

    public void printLog(String userId) {
    }
}
