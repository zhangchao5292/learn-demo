package com.suanfa.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author chao.zhang
 */
public class LruAccessOrder extends LinkedHashMap<String, String> {
    private int capacity;

    /**
     * 当LinkedHashMap的accessOrder参数为true时，即会按照访问顺序排序，最近访问的放在最前，最早访问的放在后面
     */
    public LruAccessOrder(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }

    /**
     * LinkedHashMap自带的判断是否删除最老的元素方法，默认返回false，即不删除老数据
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LruAccessOrder(6);

        linkedHashMap.put("1", "1");
        linkedHashMap.put("2", "2");
        linkedHashMap.put("3", "3");
        linkedHashMap.put("4", "4");
        linkedHashMap.put("5", "5");
        linkedHashMap.put("6", "6");
        linkedHashMap.put("7", "7");
        linkedHashMap.put("8", "8");
        linkedHashMap.put("9", "9");

        System.out.println("size=" + linkedHashMap.size());
        System.out.println(linkedHashMap.get("8"));

        linkedHashMap.forEach((k, v) -> {
            System.out.print(k + ":" + v + "  ");
        });

        System.out.println();
        System.out.println("size=" + linkedHashMap.size());
    }
}
