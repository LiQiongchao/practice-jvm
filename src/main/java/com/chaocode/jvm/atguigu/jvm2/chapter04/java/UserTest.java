package com.chaocode.jvm.atguigu.jvm2.chapter04.java;

/**
 * @author shkstart
 * @create 10:36
 */
public class UserTest {
    public static void main(String[] args) {

        // 默认加载的 target/classes/com/atguigu/java/User.class
        User user = new User(); //隐式加载

        try {
            // 加载的是 com.chaocode.jvm.atguigu.jvm2.chapter04.java.User.class 的类
            Class clazz = Class.forName("com.chaocode.jvm.atguigu.jvm2.chapter04.java.User"); //显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.chaocode.jvm.atguigu.jvm2.chapter04.java.User");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
