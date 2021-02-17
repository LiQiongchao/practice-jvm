package com.chaocode.jvm.atguigu.chapter16.java;

/**
 * -XX:+PrintGCDetails
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  14:57
 */
public class LocalVarGC {
    public void localvarGC1() {
        byte[] buffer = new byte[10 * 1024 * 1024];//10MB
        // 不会回收，full gc后进入了老年代。
        System.gc();
    }

    public void localvarGC2() {
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        // 会回收
        System.gc();
    }

    public void localvarGC3() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        // 虽然作用域结束了，也不会回收，使用了两个slat（this, buffer）
        System.gc();
    }

    public void localvarGC4() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        // 会回收buffer，value占用第二个slat
        System.gc();
    }

    public void localvarGC5() {
        localvarGC1();
        // 会回收，localvarGC1()方法已经出栈
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC local = new LocalVarGC();
//        local.localvarGC1();
//        local.localvarGC2();
//        local.localvarGC3();
//        local.localvarGC4();
        local.localvarGC5();
    }
}