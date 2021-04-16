package com.yolanda.Latihan1;

public class DemoAbstract {
    public static void main(String[] args) {
        //membuat objek masing2 class
        Employees employees = new SalariedEmployee("YOLOO", 2345678, 20000);
        Employees employees1 = new ComissionEmployee("PIPIP", 1910304, 50000,30,100);
        Employees employees2 = new ProjectPlanner("DUARR",120131, 10000,50000,100);

        //mencetak data
        System.out.println(employees.cetakData());
        System.out.println();
        System.out.println(employees1.cetakData());
        System.out.println();
        System.out.println(employees2.cetakData());
        System.out.println();

    }
}
