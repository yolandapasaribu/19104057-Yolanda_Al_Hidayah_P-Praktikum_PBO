//Yolanda Al Hidayah Pasaribu - 19104057 - SE 03 B
package com.yolanda.tugas1.PendaftaranMahasiswaBaru;

public class Mahasiswa {
    //deklarasi
    int nilai, nohp;
    String nama, tgl_lahir, alamat, asal_skl, prodi, jkel, agama;

    //constructor
    public Mahasiswa(int nilai, int nohp, String nama, String tgl_lahir, String alamat, String asal_skl, String prodi, String jkel, String agama) {
        this.nilai = nilai;
        this.nohp = nohp;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.asal_skl = asal_skl;
        this.prodi = prodi;
        this.jkel = jkel;
        this.agama = agama;
    }

    public Mahasiswa() {
    }

    //method
    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getNohp() {
        return nohp;
    }

    public void setNohp(int nohp) {
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsal_skl() {
        return asal_skl;
    }

    public void setAsal_skl(String asal_skl) {
        this.asal_skl = asal_skl;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJkel() {
        return jkel;
    }

    public void setJkel(String jkel) {
        this.jkel = jkel;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
}
