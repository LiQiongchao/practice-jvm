package com.chaocode.jvm.atguigu.chapter13.java3;

/**
 * String的垃圾回收:
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 * 空方法体的时候，字符串常量池的个数（Number of entries）
 * time=100的时候，字符串常量池的个数
 * time=100000的时候，字符串常量池的个数
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  21:27
 */
public class StringGCTest {
    public static void main(String[] args) {
//        int time = 100;
//        int time = 100000;
//        for (int j = 0; j < time; j++) {
//            String.valueOf(j).intern();
//        }
    }
}