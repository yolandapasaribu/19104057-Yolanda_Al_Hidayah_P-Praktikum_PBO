package com.yolanda.Asosiasi;

public class Dosen {
    //atribut
    private String kodeDosen;
    private int nimMahasiswa[] = new int[10];
    private int jmlMahasiswa;

    //constructor dosen
    public Dosen() {
    }

    //getter dan setter kode dosen
    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    //getter jumlah mahasiswa
    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public int getNimMahasiswa(int indeks){
        //fungsional
        return (nimMahasiswa[indeks]);
    }

    public void setNimMahasiswa(int nim){
        nimMahasiswa[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }
}
