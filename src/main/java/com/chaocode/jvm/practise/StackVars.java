package com.chaocode.jvm.practise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Duration;
import java.time.Instant;

/**
 * 使用本地变量测试
 * 经测试验证使用本地变量效率会比使用成员变量高，本地变量使用的是虚拟机栈操作的，而成员变量是使用引用操作的（常量池里面的）。
 */
public class StackVars {

    private int x; // instance变量

    private static int staticX; //static 变量

    public static void main(String[] args) {
        Person person = new Person("xiaoMing", 22);
        StackVars stackVars = new StackVars();
        int var = 900000000;
        Instant start = Instant.now();
        stackVars.stackAccess(var);
        System.out.println("stack use: " + Duration.between(start, Instant.now()).toMillis());
        start = Instant.now();
        stackVars.instanceAccess(var);
        System.out.println("instance use: " + Duration.between(start, Instant.now()).toMillis());
        start = Instant.now();
        stackVars.staticAccess(var);
        System.out.println("static use: " + Duration.between(start, Instant.now()).toMillis());
        start = Instant.now();
        stackVars.stackAccess(var, person);
        System.out.println("stack person use: " + Duration.between(start, Instant.now()).toMillis());
        start = Instant.now();
        stackVars.instanceAccess(var, person);
        System.out.println("instance person use: " + Duration.between(start, Instant.now()).toMillis());
    }


    public void stackAccess(int val) { //访问和操作stack变量j 
        int j = 0;
        for (int i = 0; i < val; i++) {
            j += 1;
        }
    }


    public void instanceAccess(int val) {//访问和操作instance变量x 
        for (int i = 0; i < val; i++) {
            x += 1;
        }
    }


    public void staticAccess(int val) {//访问和操作static变量staticX 
        for (int i = 0; i < val; i++) {
            staticX += 1;
        }
    }


    public void stackAccess(int val, Person person) { //访问和操作stack变量j
        Person person1 = person;
        for (int i = 0; i < val; i++) {
            person1.getName();
            person1.getAge();
        }
    }


    public void instanceAccess(int val, Person person) {//访问和操作instance变量x
        for (int i = 0; i < val; i++) {
            person.getName();
            person.getAge();
        }
    }
    //经测试，发现运行instanceAccess（）和staticAccess（）方法的时间大约相同，但却比运行stackAccess（）方法慢了2～3倍。因此我们对instanceAccess（）、staticAccess（）两个方法的代码作以下调整，以得到更快的性能：
    /*public void instanceAccess(int val) {//访问和操作instance变量x
        int tempX=x;
        for (int i = 0; i < val; i++) {
            tempX += 1;
        }
        x=tempX;
    }
    public void staticAccess(int val) {//访问和操作static变量staticX
        int tempStaticX=staticX;
        for (int i = 0; i < val; i++) {
            tempStaticX += 1;
        }
        staticX=tempStaticX;
    }*/

}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private int age;

}
