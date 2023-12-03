package com.miko.test03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;


public class TestDateTimeFormatter {
    //这是程序的主入口
    public static void main(String[] args) {
        //ISO_LOCAL_DATE_TIME,预定义的格式
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //isoLocalDateTime可以完成LocalDateTime和String的转换
        //1.先搞一个LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.now();
        //转换
        String str = isoLocalDateTime.format(localDateTime);
        //完成转换
        System.out.println(str);

        //String-->LocalDateTime
        TemporalAccessor parse = isoLocalDateTime.parse(str);
        System.out.println(parse);

        //本地化相关格式ofLocalizedDateTime
        //参数：FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        //创建一个LocalDateTime对象
        LocalDateTime localDateTime1 = LocalDateTime.now();
        //转换为String类型
        String format = localDateTime1.format(dateTimeFormatter);

        System.out.println(format);

        //转换为LocalDateTime类型
        TemporalAccessor parse1 = dateTimeFormatter.parse(format);
        System.out.println(parse1);

        //自定义格式
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yy-MM-dd hh-mm-ss");
        LocalDateTime localDateTime2 = LocalDateTime.now();
        //LocalDateTime-->String
        String format1 = dateTimeFormatter1.format(localDateTime2);
        System.out.println(format1);

        TemporalAccessor parse2 = dateTimeFormatter1.parse(format1);
        System.out.println(parse2);
    }
}
