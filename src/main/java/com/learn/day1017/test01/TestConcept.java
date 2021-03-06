package com.learn.day1017.test01;

/*
第九章  多线程
一、相关概念（简单了解）
1、程序（program）：是指为了完成某个任务、功能，选择某种编程语言（C、Java、...）而编写的一组指令。
        这组指令是静态的。当你把程序安装到电脑等时，这组指令就存储到电脑的硬盘上中，但是目前是静态的，不在内存中。
2、软件(software)：一个软件是由一个或多个程序 + 该程序运行时需要的其他的资源库，一起构成软件。
3、进程(process)：指程序启动了，操作系统会给每一个启动的程序分配一个进程，每一个进程之间的内存等是独立的。
        进程是操作系统分配和调度资源的最小单位。
        操作系统现在都是多任务的操作系统，进程之间的切换的成本比较高。
4、线程(thread)：一个进程中的其中一条执行路径。一个进程至少有一条执行路径，如果只有一条，称为单线程程序。
       如果有多条执行路径，称为多线程程序。
       多线程看起来是同时运行的，CPU可以在多个线程之间切换。
       但是因为这多个线程同属于同一个进程，因此他们之间有共享的内存，这样的话，在内部实现数据共享，
       通信等成本比较低，比在多个进程之间进行数据分享，通信，以及CPU切换的成本要低很多。
       线程是CPU调度的最小单位。有的时候会把线程称为轻量级的进程。
5、并行(parallel)：
      多个任务（进程、线程）真正的是同时进行。这个前提是有多个CPU。
      如果是单核的CPU，是不可能实现并行。

6、并发(concurrency)：
    多个任务（进程、线程）看起来是同时进行，但是微观角度，其实是轮流或抢夺CPU执行，
    即从某一个时刻来说，只有一个任务在执行，但是因为CPU的切换速度很快，人感觉不到。
    单核肯定是并发。
    多核也会出现并发，当任务的数量 大于  CPU的核数。

在Java中有一个包的类等api专门用于高并发的开发。java.util.concurrent ，简称juc。

 */
public class TestConcept {
}
