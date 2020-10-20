//Yolanda Al Hidayah Pasaribu - 19104057 - SE 03 B
package com.yolanda.tugas1.KonversiSuhu;

import java.util.Scanner;

public class mainKonversiSuhu {
    public static void main(String[] args) {
        //deklarasi
        float suhu, hasilFar, hasilCel, hasilRea, hasilKel;

        //objek baru konversiSuhu
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        Scanner scn = new Scanner(System.in);

        System.out.println("====KONVERSI SUHU====");
        System.out.println(" 1. Celcius ke Farenheit");
        System.out.println(" 2. Farenheit ke Kelvin");
        System.out.println(" 3. Kelvin ke Reamur");
        System.out.println(" 4. Reamur ke Celcius");
        System.out.println();
        System.out.print("Masukkan Pilihan :");
        int pilihan;

        pilihan = scn.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("1. Celcius ke Farenheit");
                //input Suhu Celcius

                System.out.print(" Suhu Celcius = ");
                suhu = scn.nextFloat();
                konversiSuhu.setCel(suhu);

                //Cetak Hasil
                System.out.println(" Hasil = " + konversiSuhu.getCel());
                break;

            case 2:
                System.out.println("2. Farenheit ke Kelvin");
                //input Suhu Farenheit

                System.out.print(" Suhu Farenheit = ");
                suhu = scn.nextFloat();
                konversiSuhu.setFar(suhu);

                //Cetak Hasil
                System.out.println("Hasil = " + konversiSuhu.getFar());
                break;
            case 3:
                System.out.println("3. Kelvin ke Reamur");
                //input Suhu Kelvin

                System.out.print(" Suhu Kelvin = ");
                suhu = scn.nextFloat();
                konversiSuhu.setKel(suhu);

                //Cetak Hasil
                System.out.println("Hasil = " + konversiSuhu.getKel());
                break;
            case 4:
                System.out.println("4. Reamur ke Celcius");
                //input Suhu Reamur

                System.out.print(" Suhu Reamur = ");
                suhu = scn.nextFloat();
                konversiSuhu.setRea(suhu);

                //Cetak Hasil
                System.out.println(" Hasil = " + konversiSuhu.getRea());
                break;
            default:
                System.out.println("======================");

        }
    }
}
