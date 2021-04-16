package com.yolanda.Latihan1;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class club {
    //atribut
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskrpsi;

    //club1 - overloading constructure kosong
    public club() {
    }

    //club2 - overloading constructure 1
    public club(String nama) {
        this.nama = nama;
    }

    //club3 - overloading constructure 2
    public club(String nama, String deskrpsi) {
        this.nama = nama;
        this.deskrpsi = deskrpsi;
    }

    //club4 - overloading constructure 3
    public club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    //club5 - overloading constructure 5
    public club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskrpsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskrpsi = deskrpsi;
    }

    public void getTeam() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Stadion\t\t\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi\t\t: " + deskrpsi);
    }
}
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
