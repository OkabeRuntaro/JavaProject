package com.miko.test03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDate {
    //这是程序的主入口
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();//当前年月日
        LocalTime localTime = LocalTime.now();//当前时分秒
        LocalDateTime localDateTime = LocalDateTime.now();//当前年月日T时分秒

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //方法of,自定义一个时间，但LocalDate的原时间不变
        LocalDate localDate1 = LocalDate.of(1998,5,5);
        System.out.println(localDate1);


        //get方法
        System.out.println(localDateTime.getYear());//显示年
        System.out.println(localDateTime.getMonth());//显示月，英文
        System.out.println(localDateTime.getMonthValue());//显示月，数字
        System.out.println(localDateTime.getDayOfMonth());//显示天
        System.out.println(localDateTime.getDayOfWeek());//显示当天在这周的星期几
        System.out.println(localDateTime.getHour());//显示小时
        System.out.println(localDateTime.getMinute());//显示分钟
        System.out.println(localDateTime.getSecond());//显示秒


        //(set)with方法
        LocalDateTime with = localDateTime.withMonth(9);//更改月份，新的对象
        System.out.println(with);

    }
}
