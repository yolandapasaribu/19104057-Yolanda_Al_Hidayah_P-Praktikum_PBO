package com.yolanda.Asosiasi;

public class Mahasiswa {
    //atribut
    private int nim;
    private String nama;

    //constructor mahasiswa
    public Mahasiswa() {
    }

    //constructor mahasiswa dengan paramater nim dan nama
    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    //getter & setter nim
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    //getter & setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
