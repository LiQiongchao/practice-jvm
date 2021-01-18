package com.chaocode.jvm.atguigu.chapter08.java;

/**
 * 修改jvm的堆的初始化大小与最大的大小
 *  -Xms10m -Xmx10m
 */
public class HeapDemo {

    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }

}