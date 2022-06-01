package com.learn.day1026.test03;

/*
五、HashMap（哈希表）
Hashtable和HashMap，LinkedHashMap，ConcurrentHashMap都和哈希表有关。

HashMap：底层的物理结构，
        JDK1.7：数组 + 链表
        JDK1.8：数组 + 链表/红黑树

  问题1：为什么需要数组加链表？
     数组的优势是根据[index]的查询效率很高。


 问题2：我们之前的动态数组，元素都靠左对齐，
        现在的哈希表的结构，数组中的元素并不一定是左对齐。

 问题3： 为什么JDK1.8，要加入红黑树  ？
        如果hashCode冲突的比较严重中， 数组[下标]下面的链表会很长，查询效率就低了。
        所以当我们链表长到一定长度时，要把链表变为红黑树，提高查询效率。

 问题4：为什么不直接用红黑树，去掉链表呢？
        红黑树的查询高，但是每次添加或删除时，操作比较复杂，要考虑新的平衡性，重新旋转啥的，都需要消耗时间。
        当我们元素个数没有那么多的时候，还是用链表比较简单。

 */
public class TestHashMap {
}
