package com.miko.test1;

import java.util.Objects;

public class Phone {
   private String brand;
   private Double price;
   private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone() {
    }

    public Phone(String brand, Double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        Phone phone = (Phone) obj;//把传入的值转为Phone类型
//        if (this.getBrand() == phone.getBrand()&&this.getPrice()==phone.getPrice()&&this.getYear()==phone.getYear()){
//            return true;
//        }else {
//            return false;
//        }
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, price, year);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) //调用者==被调用者（地址），返回true
            return true;
        if (o == null || getClass() != o.getClass())//调用者与被调用者不在一个类里，返回false
            return false;
        Phone phone = (Phone) o;//向下转型，为了能让父类调用到子类特有的内容
        return year == phone.year && Objects.equals(brand, phone.brand) && Objects.equals(price, phone.price);//比较所有的值
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
