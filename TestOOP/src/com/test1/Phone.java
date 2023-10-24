package com.test1;

public class Phone {
    double price;
    double length;
    double width;
    double height;
    double weight;
    String system;

    //一般保证空构造器的存在，但一般不会在里面进行属性的赋值操作
    //一般会重载构造器，在重载的构造器里进行属性赋值操作
    //重载构造器后，没有写空构造器，系统不会给你默认的空构造器，那么调用空构造器就会报错（new一个无参就报错）



    //重载一个构造方法,全参构造
    public Phone(double price,double length,double width,double height,double weight,String system) {
        this.price = price;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = height;
        this.system = system;
    }
    public Phone(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", system='" + system + '\'' +
                '}';
    }
}
