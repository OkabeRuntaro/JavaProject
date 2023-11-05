package com.miko.test4;
//我是接口，与类在同一层次
//接口中没有构造器
//JDK1.8之前，接口只有两部分内容
//1.常量 public static final修饰
// 2.抽象方法 public abstract修饰

public interface TestInterface {

    //1.常量
    /*public static final 默认修饰了*/ int NUM = 10;
    //2.抽象方法
    /*public abstract 默认修饰了*/void a();

    //3.非抽象方法，但是要加default
    //为什么要有非抽象方法？如果接口中只能定义抽象方法，那么修改接口中的内容，对实现类的影响太大了，所有实现类都会受影响
    //在接口中加入非抽象方法，对实现类没有影响，想调用就调用
    public default void b() {
        System.out.println("我是非抽象方法b");
    }
    //4.静态方法
    public static void c(){
        System.out.println("我是静态方法c");
    }
}
//类和接口的关系是什么呢？
// 实现关系，类实现接口

