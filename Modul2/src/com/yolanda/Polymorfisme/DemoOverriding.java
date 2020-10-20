package com.yolanda.Polymorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
