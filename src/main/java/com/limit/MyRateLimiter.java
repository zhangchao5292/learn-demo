package com.limit;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 17:29
 **/
public abstract class MyRateLimiter {

    public synchronized boolean tryAcquire() {
        return false;
    }

}
