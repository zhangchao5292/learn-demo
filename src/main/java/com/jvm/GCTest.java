package com.jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * @author chao.zhang
 */
public class GCTest {
    public static void main(String[] main) {
        // Enter infinite loop which will add a String to the list: l on each
        // iteration.
        try {
            List l = new LinkedList();
            while (true){
                l.add("Hello, World");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
