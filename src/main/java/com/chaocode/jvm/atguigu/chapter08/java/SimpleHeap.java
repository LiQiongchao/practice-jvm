package com.chaocode.jvm.atguigu.chapter08.java;

/**
 * @Author: LiQiongchao
 * @Date: 2021/1/18 21:48
 */
public class SimpleHeap {

    private int id;//属性、成员变量

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }
    public static void main(String[] args) {
        SimpleHeap sl = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);

        int[] arr = new int[10];

        Object[] arr1 = new Object[10];
    }

}
