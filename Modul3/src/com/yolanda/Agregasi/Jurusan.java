package com.yolanda.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    //prosedur
    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    //cetak da
    public void printDataJurusan() {
        System.out.println("Nama Jurusan\t: " + getNamaJurusan());
        System.out.println("Nama Jurusan\t: " + getKodeJurusan());
        System.out.println("Nama Jurusan\t: ");

        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println("-> Nama\t: " + mahasiswa.getNama() +
                    " \t-> Nim\t: " + mahasiswa.getNim());
        }
    }
}
