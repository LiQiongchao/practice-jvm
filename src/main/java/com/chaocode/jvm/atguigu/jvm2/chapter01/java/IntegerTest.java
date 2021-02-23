package com.chaocode.jvm.atguigu.jvm2.chapter01.java;

/**
 * @author shkstart
 * @create 2020-09-01 22:31
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer x = 5; //自动拆箱，调用intValue方法
        int y = 5;
        System.out.println(x == y);//true

        /**
         * Integer 和 Long会缓存-128~127的数字，
         * 如果在这区间会直接返回。否则就new一个新对象返回。
         */
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);//true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false

    }
}
