//Yolanda Al Hidayah Pasaribu - 19104057

package com.yolanda.modul1.Object;

public class Objek {
    public static void main(String[] args) {
        //class objek
        // objek itu sbg class main atau demo class
        // mahasiswa sbg constructor nya

        //deklarasi object tanpa paramater
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Yolo");
        mahasiswaTanpa.setNim(19104057);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t: "+ mahasiswaTanpa.getNim());
        System.out.println();

        //deklarasi objek dengan paramater
        Mahasiswa mahasiswa = new Mahasiswa("TERERETT", 123456789);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " +mahasiswa.getNim());

    }
}
