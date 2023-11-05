package com.miko.test3;

public class Student extends Person{

    @Override
    public void eat() {
        System.out.println("我必须重写抽象父类的eat方法");
    }
}
