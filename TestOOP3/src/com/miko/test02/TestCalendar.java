package com.miko.test02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    //这是程序的主入口
    public static void main(String[] args) {
        //Calender是一个抽象类
        // GregorianCalendar是Calender的子类
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);

        //常用方法
        //get()
        System.out.println(calendar.get(Calendar.YEAR));//年
        System.out.println(calendar.get(Calendar.MONTH));//月(从0开始)
        System.out.println(calendar.get(Calendar.DATE));//日
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//一个星期中的第几天(从星期天开始算)
        System.out.println(calendar.getActualMaximum(Calendar.DATE));//当月日期最大天数
        System.out.println(calendar.getActualMinimum(Calendar.DATE));//当月日期最小天数

        //set()

    }
}
