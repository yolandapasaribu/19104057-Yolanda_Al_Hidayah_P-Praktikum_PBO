//Yolanda Al Hidayah Pasaribu - 19104057

package com.yolanda.modul1.Class;

public class Kelas {
    //identitas
    private static String nama = "Yoloo";

    //method functional
    // kalo function pakenya variabel dan harus ada return
    private static int setMinute(){
        //identitas
        int minute = 10;
        return minute;
    }

    //output
    public static void main(String[] args) {
        System.out.println("Nama\t\t: "+ nama);
        System.out.println("Minute\t\t: "+ setMinute());
    }
}
