package com.test2;

import com.test1.Student;

public class Main {
    int a;
    static int b;
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setClassName("二班");
        System.out.println(student);

    oneTest();

    }

    public void twoTest() {
        //普通块限制了局部变量的的作用域
        {
            System.out.println("我是普通块");
        }
    }

    public static void oneTest() {

    }
    //构造块作用域
    {
        System.out.println("我是构造块");
    }
    static {
        System.out.println("我是静态块");
        System.out.println(b);
        oneTest();
    }
}