package com.miko.test4;

public class Test implements TestInterface{
    //实现
    @Override
    public void a() {
        System.out.println("我实现了TestInterface接口的a方法");
    }
//重写
    @Override
    public void b() {

        TestInterface.super.b();
    }
}
