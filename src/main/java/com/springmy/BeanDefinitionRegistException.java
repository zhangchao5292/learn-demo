package com.springmy;

/**
 * @author chao.zhang
 */
public class BeanDefinitionRegistException extends Exception{

    private String msg;

    public BeanDefinitionRegistException(String msg) {
        this.msg=msg;
    }
}
