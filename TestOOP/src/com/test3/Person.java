package com.test3;

public class Person {
    //属性

    private String name;
    private int age;
    private double height;

    //set,get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //方法

    @Override
    public String toString() {
        return
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height
                ;
    }
}
