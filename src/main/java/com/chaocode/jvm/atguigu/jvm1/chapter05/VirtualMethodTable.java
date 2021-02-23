package com.chaocode.jvm.atguigu.jvm1.chapter05;

interface Friendly {
    void sayHello();
    void sayGoodbye();
}
class Monkey {
    public void sayHello() {
    }
    public String toString() {
        return "Monkey";
    }
}
class Donkey implements Friendly {
    public void eat() {
    }
    public void sayHello() {
    }
    public void sayGoodbye() {
    }
    protected void finalize() {
    }
    public String toString(){
        return "Donkey";
    }
}

// lemur 狐猴
class Lemur extends Monkey implements Friendly {
    public void sayHello() {
        super.sayHello();
    }
    public void sayGoodbye() {
    }
}

/**
 * 虚方法与非虚方法测试
 */
public class VirtualMethodTable {
}