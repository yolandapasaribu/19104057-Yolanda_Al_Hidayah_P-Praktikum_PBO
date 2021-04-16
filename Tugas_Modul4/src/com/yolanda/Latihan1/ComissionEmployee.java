package com.yolanda.Latihan1;

public class ComissionEmployee extends Employees {
    //atribut
    public String nama;
    private int nip;
    private float totalGaji;
    private float gajiPokok;
    private float komisi;
    private float totalPenjualan;

    //constructor
    public ComissionEmployee(String nama, int nip, float gajiPokok, float komisi, float totalPenjualan) {
        super(" Commision Employee");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    //fungsi menghitung gaji

    @Override
    protected float menghitungGaji() {
        totalGaji = gajiPokok + (komisi * totalPenjualan);
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
        System.out.println("Total Penjualan\t: " + totalPenjualan);
        System.out.println("Total Gaji\t\t: "+ this.menghitungGaji());
        return super.toString()+
                " yang bernama " + nama +
                " dengan NIP " + nip +
                " mendapatkan komisi Rp " + komisi +
                " mendapatkan Gaji Pokok sebesar Rp " + gajiPokok +
                " dengan total penjualan sebanyak" + totalPenjualan +
                ",sehingga " + nama +
                " mendapatkan Total gaji Rp " +
                this.menghitungGaji();
    }
}
