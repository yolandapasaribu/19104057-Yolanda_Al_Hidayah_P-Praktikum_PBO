package com.yolanda.modul5;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        System.out.println("Input Array Length\t: ");
        int[] array = new int[(intInputMethod())];

        try {
            //harus urutan
            System.out.println("Masukan data\t: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Index ke-" + i + "\t ");
                array[i] = intInputMethod();
            }
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Masukin angka!");
        } finally {
            System.out.println("\nOutput\t: ");
            for (int x : array){
                System.out.println("Data\t: " +x);
            }
        }
    }

    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

}
