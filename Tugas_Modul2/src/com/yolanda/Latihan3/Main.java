package com.yolanda.Latihan3;
/*
 *
 * Program by Yolanda Al Hidayah Pasaribu
 *
 * SE 03 B - 19104057
 *
 */
public class Main {
    public static void main(String[] args) {

        //objek baru
        mahasiswa mhs = new mahasiswa("Yolanda","Hubungan tanpa status",3);
        pacar pcr = new pacar("","",0,"Ardhito Pramono","Dah lama pokoknya tapi cuma dianggap teman");

        // cetak output
        mhs.getStatus();
        pcr.getStatus();
    }
}

