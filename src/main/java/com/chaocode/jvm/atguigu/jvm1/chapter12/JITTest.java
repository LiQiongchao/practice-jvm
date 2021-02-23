package com.chaocode.jvm.atguigu.jvm1.chapter12;

import java.util.ArrayList;

/**
 * 运行起来后，可以使用JvisualVM或者JConsole来查看代码编译有次数及使用的时间。
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  10:35
 */
public class JITTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add("让天下没有难学的技术");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}