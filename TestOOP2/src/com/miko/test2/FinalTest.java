package com.miko.test2;

public class FinalTest {
    //这是程序的主入口
    public static void main(String[] args) {
        //final修饰的变量不能再修改，而且有约定俗成的规定：名字要大写
        final int a = 10;

        //final修饰的对象地址值不可以改变
        final Dog dog = new Dog();
        //但里面的属性可以改变
        dog.age = 10;

    }
}
