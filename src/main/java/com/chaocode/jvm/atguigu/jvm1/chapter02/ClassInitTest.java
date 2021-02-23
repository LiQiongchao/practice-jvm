package com.chaocode.jvm.atguigu.jvm1.chapter02;

/**
 * 类初始化测试
 * view -> Show Bytecode with Jclasscode
 * 查看字节码文件。
 * Methods
 *  - <init>
 *  - main
 *  - <clinit>
 *
 * @author Liqc
 * @date 2020/12/30 13:38
 */
public class ClassInitTest {

    private static int a = 10;

    static {
        a = 20;
        b = 10;
    }
    private static int b = 20;

    public static void main(String[] args) {
        System.out.println(a);
    }

    /* Methods -> <clinit> -> Code
     0 bipush 10
     2 putstatic #3 <com/chaocode/jvm/atguigu/chapter02/ClassInitTest.a>
     5 bipush 20
     7 putstatic #3 <com/chaocode/jvm/atguigu/chapter02/ClassInitTest.a>
    10 bipush 10
    12 putstatic #5 <com/chaocode/jvm/atguigu/chapter02/ClassInitTest.b>
    15 bipush 20
    17 putstatic #5 <com/chaocode/jvm/atguigu/chapter02/ClassInitTest.b>
    20 return
     */

}
