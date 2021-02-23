package com.chaocode.jvm.atguigu.jvm1.chapter06;

/**
 * 本地方法定义
 */
public class IHaveNatives {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;

}