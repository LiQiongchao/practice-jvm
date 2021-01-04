package java.lang;

/**
 * 测试是否可以使用 java.lang的包名定义类
 *
 * @author Liqc
 * @date 2021/1/4 14:18
 */
public class CustomStart {

    public static void main(String[] args) {
        System.out.println("hello custom start class");
        /*
        java.lang.SecurityException: Prohibited package name: java.lang
            at java.lang.ClassLoader.preDefineClass(ClassLoader.java:662)
            at java.lang.ClassLoader.defineClass(ClassLoader.java:761)
            at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
            at java.net.URLClassLoader.defineClass(URLClassLoader.java:467)
            at java.net.URLClassLoader.access$100(URLClassLoader.java:73)
            at java.net.URLClassLoader$1.run(URLClassLoader.java:368)
            at java.net.URLClassLoader$1.run(URLClassLoader.java:362)
            at java.security.AccessController.doPrivileged(Native Method)
            at java.net.URLClassLoader.findClass(URLClassLoader.java:361)
            at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
            at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
            at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
            at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:495)
        Error: A JNI error has occurred, please check your installation and try again
        Exception in thread "main"
         */
    }

}
