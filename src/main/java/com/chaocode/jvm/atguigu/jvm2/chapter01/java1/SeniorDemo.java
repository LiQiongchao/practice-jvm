package com.chaocode.jvm.atguigu.jvm2.chapter01.java1;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2020-09-05 18:53
 */
//public class SeniorDemo implements Serializable, Cloneable {
public class SeniorDemo {
    private int num = 1;
    public final String info = "HelloLee";
    boolean[] counts;

    public SeniorDemo(){

    }
    public SeniorDemo(int count){
        this.counts = new boolean[count];
    }

    public String getInfo(){
        return info;
    }

    public void addNum(int n){
        num += n;
        System.out.println(num);
    }
}
