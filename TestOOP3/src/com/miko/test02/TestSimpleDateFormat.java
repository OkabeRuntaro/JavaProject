package com.miko.test02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    //这是程序的主入口
    public static void main(String[] args) {
//        //String--date转换
//        java.sql.Date date = java.sql.Date.valueOf("2023-11-27");
//        //只能使用年-月-日形式，其他出现异常
//        java.util.Date date1= date;
//        System.out.println(date1);
//
//
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//自定义时间格式
        try {
            Date parse = df.parse("1942-6-4 12:22:56");
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //date-string,用的df的自定义格式转换出来
        String format = df.format(new Date());
        System.out.println(format);
    }
}
