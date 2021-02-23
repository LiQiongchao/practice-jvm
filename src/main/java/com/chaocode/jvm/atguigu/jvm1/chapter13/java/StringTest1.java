package com.chaocode.jvm.atguigu.jvm1.chapter13.java;

import org.junit.Test;

/**
 * String的基本使用:体现String的不可变性
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  23:42
 */
public class StringTest1 {
    @Test
    public void test1() {
        String s1 = "abc";//字面量定义的方式，"abc"存储在字符串常量池中
        String s2 = "abc";//使用字面量定义的字符串，都是使用的是字符串常量池中的。
        s1 = "hello";// 注释掉为true，反之为false

        System.out.println(s1 == s2);//判断地址：true  --> false

        System.out.println(s1);//
        System.out.println(s2);//abc

    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        s2 += "def";
        System.out.println(s2);//abcdef
        System.out.println(s1);//abc
    }

    @Test
    public void test3() {
        String s1 = "abc";
        String s2 = s1.replace('a', 'm');
        System.out.println(s1);//abc
        System.out.println(s2);//mbc
    }
}
