package com.chaocode.jvm.atguigu.jvm1.chapter02;

/**
 * 各个加载器的功能
 * @author Liqc
 * @date 2020/12/30 14:26
 */
public class ClassloaderTest {

    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        // 获取其上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@4eec7777

        // 获取其上层：获取不到引导类加载器（C/C++编写，在Java中获取不到）
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        // 对于用户来说：默认使用的是系统类加载器进行加载
        ClassLoader classLoader = ClassloaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        // String类使用的是引导类加载器加载的。---》 Java的核心类库都是使用引导类加载器加载的。
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null
    }

}
