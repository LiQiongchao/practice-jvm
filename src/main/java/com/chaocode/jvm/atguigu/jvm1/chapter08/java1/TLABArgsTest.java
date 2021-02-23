package com.chaocode.jvm.atguigu.jvm1.chapter08.java1;

/**
 * 测试-XX:UseTLAB参数是否开启的情况:默认情况是开启的
 * 查看方式
 *  - jps
 *      查看程序的进程id
 *  - jinfo -flag UseTLAB 进程id
 *      打印UseTLAB是否开启
 *
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  16:16
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}