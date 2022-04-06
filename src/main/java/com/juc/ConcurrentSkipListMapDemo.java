package com.juc;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-07-02 18:39
 **/
public class ConcurrentSkipListMapDemo {


    public static void main(String[] args) {
        ConcurrentSkipListMap skipListMap=new ConcurrentSkipListMap();
        skipListMap.put("a",1);
        skipListMap.put("b",13);
        skipListMap.put("c",16);

        if (skipListMap.containsKey("a")){
            System.out.println(skipListMap.get("a"));
        }
    }



}
