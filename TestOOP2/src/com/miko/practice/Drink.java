package com.miko.practice;

public class Drink {
    String name;//姓名
    double price;//价格
    String size;//大小
    String notes;//备注
    String addIce;//是否加冰
    int purchaseQuantity;//购买数量




    public Drink() {
    }

    public Drink(String name, double price, String size, String notes, String addIce, int purchaseQuantity) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.notes = notes;
        this.addIce = addIce;
        this.purchaseQuantity = purchaseQuantity;
    }

    public void addIce(String addIce) {
        if ("是".equals(addIce)){
            this.addIce = "加冰";
        } else if ("否".equals(addIce)) {
            this.addIce = "不加冰";
        }
    }
    public void getColoName(String coloName) {

    }


    public void setModelSize(int size) {
        if (size==1){
            this.size = "中杯";
        } else if (size==2) {
            this.size = "大杯";
        } else if (size==3) {
            this.size = "超大杯";
        }else {
            System.out.println("请重新输入");
        }
    }

    public void setPurchaseQuantity(int purchaseQuantity) {

    }
    public void getDrinkInformation(){
        //得到饮料信息
    }

}
