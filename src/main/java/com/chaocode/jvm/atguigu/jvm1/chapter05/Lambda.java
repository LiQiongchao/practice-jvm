package com.chaocode.jvm.atguigu.jvm1.chapter05;

/**
 * 体会invokedynamic指令
 */
@FunctionalInterface
interface Func {
    boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        Func func = s -> true;

        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}
