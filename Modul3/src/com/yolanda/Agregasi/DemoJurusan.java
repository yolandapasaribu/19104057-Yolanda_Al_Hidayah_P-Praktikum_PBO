package com.yolanda.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110","Softrware Engineering");

        Mahasiswa mahasiswa1= new Mahasiswa("Bambang Suroyo", 112344);
        Mahasiswa mahasiswa2= new Mahasiswa("Yolondoooo", 1134223);
        Mahasiswa mahasiswa3= new Mahasiswa("YOYOLOYO", 1233214);

        //list mahasiswa dari class demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Si Entong", 4324121));

        //untuk copas data dari list mahasiswa class "demoJurusan" ke class "jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        jurusan.addMahasiswa(mahasiswa3);
        jurusan.printDataJurusan();
    }
}
