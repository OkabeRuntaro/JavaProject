package com.test3;


//继承
public class Student extends Person{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                super.toString()+
                '}';
    }
}
