package com.yolanda.modul5;

public class Multi_Try_1 {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            //harus urutan
            array[5] = 30 / 0;
            System.out.println(array[5]);

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Panjang kurang dari 5!");
            System.out.println("Jangan di bagi 0");
        }
    }
}

