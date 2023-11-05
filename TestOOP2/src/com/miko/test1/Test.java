package com.miko.test1;

public class Test {
    //这是程序的主入口
    public static void main(String[] args) {
        Phone phone1 = new Phone("小米14",4999.00,2023);
        Phone phone2 = new Phone("小米14",4999.00,2023);


        //false，equals底层还是==比较，需要重写
        System.out.println(phone1.equals(phone2));

    }
}
