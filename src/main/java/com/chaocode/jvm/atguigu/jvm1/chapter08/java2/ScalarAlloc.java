package com.chaocode.jvm.atguigu.jvm1.chapter08.java2;

/**
 * @author Liqc
 * @date 2021/1/26 13:34
 */
public class ScalarAlloc {

    public static void main(String[] args) {
        alloc();
    }

    private static void alloc() {
        Point point = new Point();
        System.out.println("point.x=" + point.x + "; point.y=" + point.y);
    }

    static class Point {
        private int x;
        private int y;
    }

}
