package com.miko.test02;

import java.util.Date;

public class TestUtilDate {
    //这是程序的主入口
    public static void main(String[] args) {
        //util包里的Date类
        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());//时间戳，本地方法
        System.out.println(date.getTime());//也是时间戳
    }

    //Java.util.Date表示的是一个特定的时间点，可以精确到毫秒级
    //Java.util.Date通常用于Java应用程序中的日期和时间处理
}
