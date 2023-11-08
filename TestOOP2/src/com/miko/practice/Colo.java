package com.miko.practice;


//可乐类
public class Colo extends Drink{

    int Money;

    public Colo() {
        name = "可乐";
        price = 3;
    }

    //设置指定的可乐的名称
    public void getColoName(String coloName) {

            if (coloName.equals("可口可乐")){
                name = "可口可乐";

            } else if (coloName.equals("百事可乐")) {
                name = "百事可乐";
            }
    }

    //设置可乐购买的总钱数
    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
        this.Money = (int) (purchaseQuantity * price);

    }
    public void getDrinkInformation() {
        //得到饮料信息
        System.out.println("订单信息:您购买了可乐"+name+","+addIce+"购买的"+size+","+"购买数量"+purchaseQuantity+"杯,"+"价钱："+purchaseQuantity +"*"+ price+"="+Money+"元");

    }
    @Override
    public String toString() {
        return "Colo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", notes='" + notes + '\'' +
                ", addIce='" + addIce + '\'' +
                ", purchaseQuantity=" + purchaseQuantity +
                '}';
    }
}
