package com.yolanda.Inheritance;

public class demoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new  B();

        System.out.println("Masukin data ke SuperClass");
        superclass.x = 10;
        superclass.y = 50;
        superclass.cetakXY();
        System.out.println();

        subclass.x =30;
        subclass.y =40;
        subclass.z =10;
        subclass.cetakXY();
        subclass.sumValue();
    }
}
