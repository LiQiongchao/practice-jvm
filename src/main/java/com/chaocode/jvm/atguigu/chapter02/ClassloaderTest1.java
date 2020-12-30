package com.chaocode.jvm.atguigu.chapter02;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 *
 * @author Liqc
 * @date 2020/12/30 14:50
 */
public class ClassloaderTest1 {

    public static void main(String[] args) {
        System.out.println("**********启动类加载器**********");
        // 获取BootstrapClassloader能够加载的API的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
        // 从上面的路径中随意选择一个jar包中的类，来看看他的类加载器是什么：null (引导类加载器)
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);//null
        /*
        **********启动类加载器**********
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/resources.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/rt.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/sunrsasign.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/jsse.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/jce.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/charsets.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/lib/jfr.jar
        file:/D:/develop/Java/jdk1.8.0_102/jre/classes
         */

        System.out.println("**********扩展类加载器**********");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(":")) {
            System.out.println(path);
        }

        // 从上面的路径中随意选择一个jar包听类，来看看他的类的加载器是什么：扩展类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);//sun.misc.Launcher$ExtClassLoader@3b9a45b3
        /*
        **********扩展类加载器**********
        D
        \develop\Java\jdk1.8.0_102\jre\lib\ext;C
        \Windows\Sun\Java\lib\ext
         */
    }

}
