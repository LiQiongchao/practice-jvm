package com.chaocode.jvm.atguigu.jvm1.chapter02;

/**
 * 类初始化测试
 * view -> Show Bytecode with Jclasscode
 * 查看字节码文件。会发现没有 clInit方法，因为 clinit方法是编译static的属性和代码块生成的，当没有这些时，clinit 就不存在了。
 * init是编译的构造器。
 *
 * @author Liqc
 * @date 2020/12/30 13:38
 */
public class ClassInitTest1 {

    private int a = 10;

    public static void main(String[] args) {
    }

}
