package com.miko.test03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class TestDateTimeFormatter {
    //这是程序的主入口
    public static void main(String[] args) {
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
    }
}
