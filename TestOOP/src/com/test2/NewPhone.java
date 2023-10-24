package com.test2;

import com.test1.Phone;

public class NewPhone {
    //这是程序的主入口
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPrice(5000);
        phone.setHeight(0.7);
        phone.setWeight(4.3);
        phone.setLength(12);
        phone.setSystem("小米");
        String string = phone.toString();
        System.out.println(string);

        //调用全参构造
        Phone phone1 = new Phone(4000,13,4.5,0.8,4.5,"华为");
        System.out.println(phone1);
    }
}
