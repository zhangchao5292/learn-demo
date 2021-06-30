package com.suanfa.map;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-21 11:14
 **/
public interface IMyMap<K, V> {
    V put(K k, V v);

    V get(K k);

    int size();

    V remove(K k);

    boolean isEmpty();

    void clear();

}
