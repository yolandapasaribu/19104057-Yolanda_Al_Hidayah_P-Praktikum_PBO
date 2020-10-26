package com.yolanda.modul3.Latihan1;

public class mainKomplek {
    public static void main(String[] args) {
        //objek rumah
        Rumah rumah1 = new Rumah("BLOK B2","PIPIP CALON MANTU",2);
        Rumah rumah2 = new Rumah("BLOK A2","MIPAN ZUZUZU",4);
        Rumah rumah3 = new Rumah("BLOK B2","MANG OLEH",5);

        //objek komplek
        Komplek komplek = new Komplek("B","CINTA SEJATI");
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());

        //output
        komplek.getDataKomplek();
    }
}
