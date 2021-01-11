package com.chaocode.jvm.atguigu.chapter05;

/**
 * 虚拟机栈异常演示
 * 默认情况下：count : 11404
 * 设置栈的大小： -Xss256k : count : 2473
 *
 * @author Liqc
 * @date 2021/1/11 15:56
 */
public class StackErrorTest {

    static int num = 0;

    public static void main(String[] args) {
        num++;
        System.out.println(num);
        main(args);

    }

}
