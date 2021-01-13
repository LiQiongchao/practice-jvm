package com.chaocode.jvm.atguigu.chapter05;

/**
 * Slot重复利用测试
 *
 * @author Liqc
 * @date 2021/1/13 13:48
 */
public class SlotTest {
    public void localVarl() {
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        //此时的b就会复用a的槽位
        int b = 0;
    }
}
