package com.chaocode.jvm.atguigu.chapter08.java2;

/**
 * 同步省略说明
 * @author shkstart  shkstart@126.com
 * @create 2020  11:07
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized(hollis) {
            System.out.println(hollis);
        }
    }
}