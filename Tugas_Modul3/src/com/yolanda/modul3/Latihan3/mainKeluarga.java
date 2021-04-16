package com.yolanda.modul3.Latihan3;

import java.util.ArrayList;

public class mainKeluarga {
    public static void main(String[] args) {
        //objek keluarga
        Keluarga keluarga =new Keluarga("Keluarga Cemara","Mars");

        //ojek ayah ibu anak
        Ayah ayah = new Ayah(12345,"Bambank sayonara",45);
        Ibu ibu = new Ibu(67890, "Markonah",40);

        ArrayList<Anak> anakArrayList = new ArrayList<>();
        anakArrayList.add(new Anak(1,"Bibu", 12,"Pelajar"));
        anakArrayList.add(new Anak(2,"Bobi", 10,"Pelajar"));
        anakArrayList.add(new Anak(3,"Bibo", 10,"Pelajar"));

        //tambah data
        keluarga.addAnggotaKeluarga(ayah,ibu,anakArrayList);
        //cetak data
        keluarga.getDataKeluarga();
    }
}
