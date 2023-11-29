package com.miko.practice;

public class DrinkShop {//饮品工厂
    //static可以通过 .DrinkShop对象直接调用
    public static Drink getDrink(int drinkNum){
        Drink drink;
        if (drinkNum==1){
            drink = new Colo();

        } else if (drinkNum==2) {
            drink = new Coffee();
        }else {
            drink = new MilkTea();
        }
        return drink;
    }
}
