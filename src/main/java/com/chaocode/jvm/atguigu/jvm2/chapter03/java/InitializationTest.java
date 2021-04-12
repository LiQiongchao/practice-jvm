package com.chaocode.jvm.atguigu.jvm2.chapter03.java;

/**
 * @author shkstart
 * @create 2020-09-13 11:55
 *
 * 过程三：初始化阶段
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;

    static {
        number = 2;
        System.out.println("father static{}");
    }

    public static void main(String[] args) {
        // new时会初始化，会打印static中的代码
        InitializationTest test = new InitializationTest();
    }
}
