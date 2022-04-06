package com.suanfa.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chao.zhang
 */
public class LruAddOrder {

    int capacity;

    LinkedHashMap<Integer, Integer> cache;

    public LruAddOrder(int capacity) {
        this.cache = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LinkedHashMap<Integer, Integer> getCache() {
        return cache;
    }

    public void setCache(LinkedHashMap<Integer, Integer> cache) {
        this.cache = cache;
    }

    /**
     * 获取
     *
     * @param key
     * @return
     */
    public Integer get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        //存在，先从链表头部删除删除，在插入到链表尾部
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
        return val;
    }

    /**
     * 添加元素
     *
     * @param key
     * @param val
     */
    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.remove(key);
        }

        //如果链表已经满了，则删除头部节点
        if (cache.size() == capacity) {
            Set<Integer> keySet = cache.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            cache.remove(iterator.next());
        }

        cache.put(key, val);
    }


    public static void main(String[] args) {

        LruAddOrder lruAddOrder = new LruAddOrder(3);

        lruAddOrder.put(1, 1);
        lruAddOrder.put(2, 2);
        lruAddOrder.put(3, 3);
        lruAddOrder.put(4, 4);
        lruAddOrder.put(5, 5);

        System.out.println(lruAddOrder.cache.size());

        lruAddOrder.cache.forEach((k, v) -> {
            System.out.print(k + ":" + v + "  ");
        });

        System.out.println();
        System.out.println("size=" + lruAddOrder.cache.size());
    }

}
