//Yolanda Al Hidayah Pasaribu - 19104057

package com.yolanda.modul1.Object;

public class Mahasiswa {
    //identitas
    String nama;
    int nim;

    //constructor -> sebuah method yang nama methodnya sama kaya nama classnya
    //cara cepat -> alt+insert -> constructor -> pilih dua2 nya
    public Mahasiswa(){}

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //getter & setter
    //manipulasi
    public String getNama() { //fungsi -> karena butuh return
        return nama;
    }
    public void  setNama(String nama){ //prosedur untuk merubah
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }
    public void setNim (int nim){
        this.nim = nim;
    }
}
