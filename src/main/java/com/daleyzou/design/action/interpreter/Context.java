package com.daleyzou.design.action.interpreter;

import java.util.StringTokenizer;

/**
 * Context
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:14
 * @version 1.0.0
 */
public class Context {
    /**
     * 将字符串分解为更小的字符串 token， 默认空格分隔
     * */
    private StringTokenizer stringTokenizer;
    private String currentToken;

    public Context(String text) {
        stringTokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (stringTokenizer.hasMoreTokens()){
            currentToken = stringTokenizer.nextToken();
        }else {
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public void skipToken(String token){
        if (!token.equals(currentToken)){
            System.out.println("错误提示：" + currentToken + "解释错误");
        }
        nextToken();
    }
    public int currentNumber(){
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);

        }catch (Exception exception){
            System.out.println("转换出错：" + exception.getMessage());
        }
        return number;
    }
}
