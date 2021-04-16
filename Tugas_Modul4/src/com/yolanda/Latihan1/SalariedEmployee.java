package com.yolanda.Latihan1;

public class SalariedEmployee extends Employees {
    //atribut
    private String nama;
    private float gaji;
    private int nip;
    private float upahMingguan;

    //constructor
    public SalariedEmployee(String nama, int nip, float upahMingguan) {
        super(" Employee Salaried ");
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;
    }

    //fungsi menghitung gaji
    @Override
    protected float menghitungGaji() {
        gaji = upahMingguan;
        return gaji;
    }

    // fungsi mencetak data
   @Override
    public String cetakData() {
       System.out.println("Jenis\t\t\t:"+jenisEmploy);
       System.out.println("Nama\t\t\t: "+nama);
       System.out.println("NIP\t\t\t\t: "+nip);
       System.out.println("Upah minggunan\t: Rp"+upahMingguan);
       System.out.println("Total gaji\t\t: Rp"+this.menghitungGaji());
       return super.toString()+ "yang bernama " + nama + " dengan NIP " + nip + " memiliki total gaji Rp"+this.menghitungGaji();
   }
}
