package com.yolanda.Latihan2;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class demoBinatang {
    public static void main(String[] args) {

        //cetak output burung
        burung Burung = new burung("Buwung Puyuh");
        System.out.println("Si "+Burung.getNama());
        Burung.makan(Burung.getNama());
        Burung.tidur(Burung.getNama());
        Burung.terbang();
        System.out.println();

        //cetak output ikan
        ikan Ikan = new ikan("Baby Shark");
        System.out.println("Si "+Ikan.getNama());
        Ikan.makan(Ikan.getNama());
        Ikan.tidur(Ikan.getNama());
        Ikan.berenang();
        System.out.println();

        //cetak output kucing
        kucing Kucing = new kucing("Kocheng oren");
        System.out.println("Si "+Kucing.getNama());
        Kucing.makan(Kucing.getNama());
        Kucing.tidur(Kucing.getNama());
        Kucing.meong();
        System.out.println();
    }

}
