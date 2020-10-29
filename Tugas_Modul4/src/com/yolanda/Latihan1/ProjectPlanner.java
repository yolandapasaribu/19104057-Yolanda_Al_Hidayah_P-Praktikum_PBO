package com.yolanda.Latihan1;

public class ProjectPlanner extends Employees {
    //atribut
    public String nama;
    private int nip;
    private float gajiPokok;
    private float komisi;
    private float totalProyek;

    //constructor
    public ProjectPlanner(String nama, int nip, float gajiPokok, float komisi, float totalProyek) {
        super(" Project Planner");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalProyek = totalProyek;
    }
    //fungsi menghitung gaji
    @Override
    protected float menghitungGaji() {
        float pajak = (5/100)* gajiPokok;
        float totalGaji = gajiPokok + (komisi * totalProyek)-pajak;
        return totalGaji;
    }
    // fungsi mencetak data

    @Override
    protected String cetakData() {
        System.out.println("Jenis\t\t\t:"+jenisEmploy);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIP\t\t\t\t: " + nip);
        System.out.println("Gaji Pokok\t\t: " + gajiPokok);
        System.out.println("Komisi\t\t\t: " + komisi);
        System.out.println("Total Proyek\t: " + totalProyek);
        System.out.println("Total Gaji\t\t: "+ this.menghitungGaji());
        return super.toString()+
                " yang bernama " + nama +
                " dengan NIP " + nip +
                " mendapatkan komisi Rp " + komisi +
                " mendapatkan Gaji Pokok sebesar Rp " + gajiPokok +
                " dengan total proyek sebanyak" + totalProyek +
                ",sehingga " + nama +
                " mendapatkan Total gaji Rp " +
                this.menghitungGaji()+ "dipotong pajak 5% dari gaji pokok";
    }
}
