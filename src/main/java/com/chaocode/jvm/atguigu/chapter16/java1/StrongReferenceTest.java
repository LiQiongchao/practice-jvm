package com.chaocode.jvm.atguigu.chapter16.java1;

/**
 *  强引用的测试
 *  -XX:+PrintGCDetails
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  16:05
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer ("Hello,尚硅谷");
        StringBuffer str1 = str;

        //由于str1又指向了堆对象，所以无法回收对象
        str = null;
        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(str1);
    }
}