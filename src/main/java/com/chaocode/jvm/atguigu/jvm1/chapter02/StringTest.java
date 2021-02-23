package com.chaocode.jvm.atguigu.jvm1.chapter02;

/**
 * 测试是否能使用自定义的 java.lang.String 类
 *
 * @author Liqc
 * @date 2021/1/4 14:11
 */
public class StringTest {

    public static void main(String[] args) {
        // 加载的还是核心rt.jar中的String
        java.lang.String str = new String();
        System.out.println("hello");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
    }

}
