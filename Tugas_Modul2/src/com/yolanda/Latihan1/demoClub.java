package com.yolanda.Latihan1;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class demoClub {
    public static void main(String[] args) {
        club Club1 = new club();
        club Club2 = new club("Yoloyoloyolo");
        club Club3 = new club("Kapiten", "Aku seorang kapiten, mempunyai pedang panjang");
        club Club4 = new club("Bambang", 2001, "Laga Tangkas", 2, "Nama club bambang, club bambang juara ucl 2 sejak tahun 2001");
        club Club5 = new club("Paijo", 1994, "GBK", 3, "Club Paijo, tahun berdiri 1994, latihan di GBK");

        System.out.println("Club 1\t:");
        Club1.getTeam();
        System.out.println();
        System.out.println("Club 2\t:");
        Club2.getTeam();
        System.out.println();
        System.out.println("Club 3\t:");
        Club3.getTeam();
        System.out.println();
        System.out.println("Club 4\t:");
        Club4.getTeam();
        System.out.println();
        System.out.println("Club 5\t:");
        Club5.getTeam();
        System.out.println();
    }
}
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
