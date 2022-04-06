package com.suanfa.lru;

/**
 * @author chao.zhang
 */
public class RedisLru {

    public static void main(String[] args) {
//        Redis LRU算法实现

//        Redis缓存淘汰策略。
//        noeviction：不继续提供写服务，读请求可以继续。
//        volatile-lru：尝试淘汰设置了过期时间的key，最少使用的key优先淘汰。也就是说没有设置过期时间的key不会被淘汰。
//        volatile-ttl：也是淘汰设置了过期时间的key，只不过策略不是lru，而是根据剩余寿命的ttl值，ttl越小越优先被淘汰。
//        volatile-random：同理，也是淘汰设置了过期时间的key，只不过策略是随机。
//        allkeys-lru：类比volatile-lru，只不过未设置过期时间的key也在淘汰范围。
//        allkeys-random：类比volatile-random，只不过未设置过期时间的key也在淘汰范围。

//        采用HashMap + 双向循环链表具有较好的读写性能，但是有没有发现什么问题呢？对，HashMap和链表都存在空间浪费的情况，HashMap本来就很耗内存，双向链表由于需要空间存储指针，两种数据结构空间使用率都不高，这显然很不划算
//        Redis做法很简单：随机取若干个key，然后按照访问时间排序，淘汰掉最不经常使用的数据。为此，Redis给每个key额外增加了一个24bit长度的字段，用于保存最后一次被访问的时钟

    }


}
