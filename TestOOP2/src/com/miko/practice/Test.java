package com.miko.practice;

import java.util.Scanner;

public class Test {

    //这是程序的主入口
    public static void main(String[] args) {
        Drink drink = new Drink();
        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入你需要购买的饮品：1.可乐 2.咖啡 3.奶茶");
        int nexted = scanner.nextInt();
        drink = DrinkShop.getDrink(nexted);//得到了需要的饮料对象



        //System.out.println(drink);


        System.out.println("请录入你需要的"+drink.name+"信息：");
        String next = scanner.next();
        drink.getColoName(next);
        //System.out.println(drink);//输出了饮料对象


        System.out.println("备注"+drink.name+"是否加冰：");
        next = scanner.next();
        drink.addIce(next);
        //System.out.println(drink);


        System.out.println("选择：1.中杯 2.大杯 3.超大杯");
        nexted = scanner.nextInt();
        drink.setModelSize(nexted);


        System.out.println("购买数量：");
        nexted = scanner.nextInt();
        drink.setPurchaseQuantity(nexted);
        drink.getDrinkInformation();
    }
}
