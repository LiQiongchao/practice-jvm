package com.chaocode.jvm.atguigu.chapter02;

/**
 * 获取类加载器的方式
 * @author Liqc
 * @date 2021/1/4 13:59
 */
public class ClassloaderTest2 {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);//null
        // 2.
        ClassLoader classLoader1 = Thread.currentThread().getClass().getClassLoader();
        System.out.println(classLoader1);//null
        // 3.
        ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
        System.out.println(parent);// sun.misc.Launcher$ExtClassLoader@4eec7777
    }

}
