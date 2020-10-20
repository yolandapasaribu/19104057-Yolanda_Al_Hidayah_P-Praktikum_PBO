package com.yolanda.Latihan3;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class pacar extends mahasiswa{
    //atribut
    public String namaPacar;
    public String lamaHubungan;

    //constructor
    public pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    //method
    public void getStatus(){
        System.out.println("Nama Pacar\t\t: "+namaPacar);
        System.out.println("Lama Hubungan\t: "+lamaHubungan);
    }
}

/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */