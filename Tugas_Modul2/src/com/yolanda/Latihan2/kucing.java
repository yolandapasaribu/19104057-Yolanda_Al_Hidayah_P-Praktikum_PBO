package com.yolanda.Latihan2;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class kucing extends binatang {
    //Atribut
    public String nama;

    //constructor
    public kucing(String nama) {
        this.nama = nama;
    }

    //method
    public String getNama(){
      return this.nama;
    }

    public void meong(){
        System.out.println( nama + " sedang meong di depan rumah");
    }
}
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */