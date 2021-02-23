package com.chaocode.jvm.atguigu.jvm2.chapter01.java;
/*
成员变量（非静态的）的赋值过程： ① 默认初始化 - ② 显式初始化 /代码块中初始化 - ③ 构造器中初始化 - ④ 有了对象之后，可以“对象.属性”或"对象.方法"
 的方式对成员变量进行赋值。
 */
class Father {
    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }
    public void print() {
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father {
    int x = 30;
//    float x = 30.1F;
    public Son() {
        this.print();
        x = 40;
    }
    public void print() {
        System.out.println("Son.x = " + x);
    }
}

public class SonTest {

    /*
       方法有多态，属性没有多态。
       1.调用父类的构造器，构造器print方法多态调用Son的，由于Son.x没有显示初始化，所以是默认值0
       2.Son构造器中print打印的是Son显示初始化后的值，所以是30
       3.main方法中打印的是Father.x的值（属性没有多态），所以是20
     */
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}
