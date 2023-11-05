package com.miko.test4;

public class Demo implements TestInterface{
    //这是程序的主入口
    public static void main(String[] args) {

    }

    @Override
    public void a() {
        System.out.println("我重写了a方法");
    }

    @Override
    public void b() {
        TestInterface.super.b();
    }

    //不是重写方法，虽然与接口的c方法相同，但属于各自类里的c方法，想要用接口的c方法可以TestInterface.c();
    public static void c(){
        System.out.println("我是静态方法c");
    }
}
