package com.yolanda.modul5;

public class Finally {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            //database di open
            System.out.println("Akses Elemen ke 5\t : " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // exeption
            System.out.println("ada Exeption Array");
        } finally {
            //database di tutup
            array[array.length - 1] = 10;
            System.out.println("Nilai Elemen Terakhir\t: " + array[array.length - 1]);
        }
    }
}
