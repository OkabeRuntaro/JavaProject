package com.test3;

public class Test {
    //这是程序的主入口
    public static void main(String[] args) {
        //创建student对象
        Student student = new Student();
        student.setId(1);
        student.setAge(18);
        student.setHeight(172);
        student.setName("张三");

        System.out.println(student);
        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}
