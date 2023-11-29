package com.miko.test02;

import java.sql.Date;
//sql.Date是util.Date的子类
public class TestSqlDate {
    //这是程序的主入口
    public static void main(String[] args) {
        Date d = new Date(2023,11,21);

        //Sql.date转换Util.date
        java.util.Date date = new java.util.Date();//创建util.date对象//
        System.out.println(date);

        //util转为sql
        //方法1.向下转型
        Date date1 = (Date) date;
        //方法2.利用构造器
        Date date2 = new Date(date.getTime());

    }
    //java.sql.Date表示的是一个日期，通常用于数据库中的日期字段，不包含时间信息
    //java.sql.Date主要用于Java数据库编程，与数据库中的日期字段进行交互
    //Java.util.Date和java.sql.Date都是用于表示日期和时间的类，但它们的功能和使用场景不同
}
