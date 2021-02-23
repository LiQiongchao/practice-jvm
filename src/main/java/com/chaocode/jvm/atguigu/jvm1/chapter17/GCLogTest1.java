package com.chaocode.jvm.atguigu.jvm1.chapter17;

/**
 * 在jdk7 和 jdk8中分别执行
 *  上面代码在JDK7中执行后，放第4个对象的时候，由于eden区满了会触发GC，eden清空，对象进入老年代（Survivor放不下。）新对象（第4个对象）分配到eden区。
 *  在JDK8中，发现eden区不够，发现是大对象，直接放到老年代中。
 *
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  0:12
 */
public class GCLogTest1 {
    private static final int _1MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] agrs) {
        testAllocation();
    }
}