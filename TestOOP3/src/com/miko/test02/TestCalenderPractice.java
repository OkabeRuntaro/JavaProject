package com.miko.test02;

import java.util.Calendar;
import java.util.Scanner;

public class TestCalenderPractice {
    //这是程序的主入口
    public static void main(String[] args) {

        //录入日期的String
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入时间：yyyy-mm-dd");
        String next = scanner.next();

        //转换日期
        java.sql.Date date = java.sql.Date.valueOf(next);
        System.out.println(date);
        //date转为Calender类型，更方便地进行日期和时间处理操作
        //Calendar.getInstance()获取当前时间日期，超长一串！
        Calendar calendar = Calendar.getInstance();
        //setTime：把时间设置进去
        calendar.setTime(date);

        //星期提示
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

        int count = 0;

        //本月最大天数
        int actualMaximum = calendar.getActualMaximum(Calendar.DATE);
        //获取输入的当日时间
        int calDay = calendar.get(Calendar.DATE);
        //设置为第一天
        calendar.set(Calendar.DATE,1);

        //得到本月第一天是在哪一个星期上
        int sumDay = calendar.get(Calendar.DAY_OF_WEEK);
        //记录空出来的天数
        int day = sumDay - 1;

        //在日期前打印空格
        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }
        //记录天数的
        count = count+day;

        for (int i = 1; i <= actualMaximum; i++) {


            if (i == calDay){
                System.out.print(i+"*"+"\t");
            }else {
                System.out.print(i+"\t");
            }
            count++;
            if (count%7==0){
                System.out.println();
            }
        }
    }
}
