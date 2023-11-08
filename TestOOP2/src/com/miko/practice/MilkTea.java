package com.miko.practice;

public class MilkTea extends Drink{
    @Override
    public String toString() {
        return "MilkTea{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", notes='" + notes + '\'' +
                ", addIce='" + addIce + '\'' +
                ", PurchaseQuantity=" + purchaseQuantity +
                '}';
    }
}
