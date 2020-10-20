package com.yolanda.Latihan3;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class mahasiswa {
    //atribut
    public String nama;
    public String status;
    public int semester;

    //constructor
    public mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    //method
    public void getStatus() {
        System.out.println("Nama\t\t\t: "+ nama);
        System.out.println("Status\t\t\t: "+status);
        System.out.println("Semester\t\t: "+semester);
    }
}
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
