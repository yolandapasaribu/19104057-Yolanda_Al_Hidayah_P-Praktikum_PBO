package com.yolanda.Agregasi;

public class Mahasiswa {
    //atribut
    private String nama;
    private  int nim;

    //constructor mahasiswa
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //getter nama dan nim

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }
}
