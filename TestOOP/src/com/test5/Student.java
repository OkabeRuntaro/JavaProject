package com.test5;

public class Student extends Person {
    public void study() {
        System.out.println("学习");

    }

    public void eat() {
        System.out.println("我是重写了父类的eat");
    }
}
