package com.yolanda.tugas5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IDpengunjung {
    //input integer
    public static int inputPengunjung() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    //input string
    public static String lihatData() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        //jumlah pengunjung
        System.out.print("Jumlah pengunjung\t: ");
        int data = inputPengunjung();
        int array[] = new int[data];

        //input data
        System.out.println("Masukkan Data Pengunjung\t: ");
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("UID\t: ");
                array[i] = inputPengunjung();
                System.out.println("Data ke-" + i + "\t: " + array[i] + " terdaftar!");

                //notice harus angka
            } catch (InputMismatchException e) {
                System.out.println("Harus angka!");
            }
        }

        System.out.println();
        System.out.println("Lihat Data Pengunjung\t: ");
        System.out.print("Indeks\t: ");
        int indeks = inputPengunjung();
        try {
            if (indeks <= 10) {
                while (true) {
                    System.out.println("Data ke-" + indeks + "\t: " + array[indeks]);
                    System.out.print("Lihat lagi? (y/n)\t: ");
                    String lihatData = lihatData();
                    if (lihatData == "n" || lihatData == "N") {
                        break;
                    }
                }
            } else {
                throw new Exception("Ga boleh lebih!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

