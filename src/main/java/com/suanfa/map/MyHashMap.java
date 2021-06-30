package com.suanfa.map;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-21 11:15
 **/
public class MyHashMap<K,V> implements IMyMap<K,V>{

    final static int DEFAULT_CAPACITY = 16;
    final static float DEFAULT_LOAD_FACTOR = 0.75f;

    int capacity;
    float loadFactor;
    int size = 0;

    Entry<K,V>[] table;

    class Entry<K, V>{
        K k;
        V v;
        Entry<K,V> next;

        public Entry(K k, V v, Entry<K, V> next){
            this.k = k;
            this.v = v;
            this.next = next;
        }
    }

    @Override
    public V get(K k) {
        int index = k.hashCode() % table.length;
        Entry<K, V> current = table[index];
        // 遍历链表
        while(current != null){
            if(current.k == k){
                return current.v;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V remove(K k) {
        int index = k.hashCode() % table.length;
        Entry<K, V> current = table[index];
        // 如果直接匹配第一个节点
        if(current.k == k){
            table[index] = null;
            size--;
            return current.v;
        }
        // 在链表中删除节点
        while(current.next != null){
            if(current.next.k == k){
                V oldValue = current.next.v;
                current.next = current.next.next;
                size--;
                return oldValue;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    public MyHashMap(int capacity, float loadFactor){
        this.capacity = upperMinPowerOf2(capacity);
        this.loadFactor = loadFactor;
        this.table = new Entry[capacity];
    }

    private static int upperMinPowerOf2(int n){
        int power = 1;
        while(power <= n){
            power *= 2;
        }
        return power;
    }

    @Override
    public V put(K k, V v) {
        // 通过hashcode散列
        int index = k.hashCode() % table.length;
        Entry<K, V> current = table[index];
        // 判断table[index]是否已存在元素
        // 是
        if(current != null){
            // 遍历链表是否有相等key, 有则替换且返回旧值
            while(current != null){
                if(current.k == k){
                    V oldValue = current.v;
                    current.v = v;
                    return oldValue;
                }
                current = current.next;
            }
            // 没有则使用头插法
            table[index] = new Entry<K, V>(k, v, table[index]);
            size++;
            return null;
        }
        // table[index]为空 直接赋值
        table[index] = new Entry<K, V>(k, v, null);
        size++;
        return null;
    }

}
