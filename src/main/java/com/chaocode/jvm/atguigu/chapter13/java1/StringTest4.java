package com.chaocode.jvm.atguigu.chapter13.java1;

/**
 * @author shkstart  shkstart@126.com
 * @create 2020  0:49
 */
public class StringTest4 {
    public static void main(String[] args) {
        System.out.println();//2954
        System.out.println("1");//2955
        System.out.println("2");//2956
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");//2964
        //使用IDEA的memory查看时，如下的字符串"1" 到 "10"不会再次加载
        System.out.println("1");//2965
        System.out.println("2");//2965
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");//2965
    }
}