package com.yolanda.Latihan2;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class ikan extends binatang {
    //atribut
    public String nama;

    //constructor
    public ikan(String nama) {
        this.nama = nama;
    }

    //method
    public String getNama(){
        return this.nama;
    }

    public void berenang(){
        System.out.println(nama+" sedang berenang di laut");
    }
}
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
