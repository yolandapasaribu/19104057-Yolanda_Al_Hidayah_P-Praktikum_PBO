package com.yolanda.modul3.Latihan3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {
    public List<Anak> anakList = new ArrayList<Anak>();
    public String namaKeluarga;
    public String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah,Ibu ibu, ArrayList<Anak> anak){
        this.ayah = ayah;
        this.ibu =ibu;
        this.anakList = anak;
    }

    public List<Anak> getAnakList() {
        return anakList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    //cetak data
    public void getDataKeluarga(){
        System.out.println("Nama Keluarga\t: "+getNamaKeluarga());
        System.out.println("Kota asal\t\t: "+getKotaAsal());
        System.out.println();
        System.out.println("Nama Ayah\t\t: "+getAyah().getNamaAyah());
        System.out.println("Nama Ibu\t\t: "+getIbu().getNamaIbu());
        System.out.println("Nama Anak\t: ");
        for (Anak child: getAnakList()){
            System.out.println("Nama\t: " +child.getNamaAnak());
            System.out.println("Umur\t: " +child.getUmurAnak());
            System.out.println("Status\t: "+child.getStatusAnak());
            System.out.println();
        }
    }
}
