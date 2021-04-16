package com.yolanda.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        //objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        //mengisi nama dan nim mahasiswa 1
        mhs1.setNama("Yolooo");
        mhs1.setNim(293293129);

        //mengisi data mahasiswa 2
        Mahasiswa mhs2 = new Mahasiswa(24343234, "Yolondoo");

        //mengisi kode dosen
        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");

        //tambah nim mahasiswa yang udah di daftar
        dosen.setNimMahasiswa(mhs1.getNim());
        dosen.setNimMahasiswa(mhs2.getNim());

        //mencetak output
        System.out.println("Kode dosen\t: "+dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa() ; i++) {
            System.out.println("\t->" + dosen.getNimMahasiswa(i));
        }
    }
}
