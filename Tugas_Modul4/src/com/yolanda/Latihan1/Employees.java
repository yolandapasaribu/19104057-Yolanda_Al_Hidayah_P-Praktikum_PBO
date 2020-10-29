package com.yolanda.Latihan1;

public abstract class Employees {
    //atribut
    public String jenisEmploy;
    //constructor
    public Employees(String jenisEmploy) {
        this.jenisEmploy = jenisEmploy;
    }

    public String getJenisEmploy() {
        return this.jenisEmploy;
    }

    //abstrak menghitung gaji
    protected abstract float menghitungGaji();

    // fungsi mencetak data
    protected abstract String cetakData();

    @Override
    public String toString() {
        return "Seorang " + jenisEmploy;
    }
}
