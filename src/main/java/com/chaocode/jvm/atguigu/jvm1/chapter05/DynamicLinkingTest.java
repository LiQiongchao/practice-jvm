package com.chaocode.jvm.atguigu.jvm1.chapter05;

/**
 * 动态链接测试
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA(){
        System.out.println("methodA()....");
    }

    public void methodB(){
        System.out.println("methodB()....");

        methodA();

        num++;
    }

}