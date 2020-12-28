package com.chaocode.jvm.learn;

/**
 * @author Liqc
 * @date 2020/12/28 13:09
 */
public class StackTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
    }
    /* javap -c StackTest.class 反编译
    Compiled from "StackTest.java"
    public class com.chaocode.jvm.learn.StackTest {
      public com.chaocode.jvm.learn.StackTest();
        Code:
           0: aload_0
           1: invokespecial #1                  // Method java/lang/Object."<init>":()V
           4: return

      public static void main(java.lang.String[]);
        Code:
           0: bipush        10
           2: istore_1
           3: bipush        20
           5: istore_2
           6: iload_1
           7: iload_2
           8: iadd
           9: istore_3
          10: return
    }
     */

}
