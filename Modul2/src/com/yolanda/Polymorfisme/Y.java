package com.yolanda.Polymorfisme;

public class Y extends  X {
    //override
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value class Y\t:" + value);
    }
}
