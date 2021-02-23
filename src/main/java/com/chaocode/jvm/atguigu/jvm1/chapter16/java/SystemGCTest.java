package com.chaocode.jvm.atguigu.jvm1.chapter16.java;

/**
 * @Author: LiQiongchao
 * @Date: 2021/2/17 9:50
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();//提醒jvm的垃圾回收器执行gc,但是不确定是否马上执行gc
        //与Runtime.getRuntime().gc();的作用一样。底层调用的就是java.lang.Runtime.gc

        //强制调用使用引用的对象的finalize()方法，否则有可以不执行finalize()方法
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
