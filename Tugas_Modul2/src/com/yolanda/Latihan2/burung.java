package com.yolanda.Latihan2;

/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class burung extends binatang {
    //atribut
    public String nama;

    //constructor

    public burung(String nama) {
        this.nama = nama;
    }

    //method
    public String getNama() {
        return this.nama;
    }

    public void terbang() {
        System.out.println(nama + " sedang terbang menggunakan sayap");
    }
}
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
