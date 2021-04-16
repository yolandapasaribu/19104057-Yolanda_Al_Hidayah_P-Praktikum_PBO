//Yolanda Al Hidayah Pasaribu - 19104057

package com.yolanda.modul1.Pass;

public class Pass {
    public static void main(String[] args) {
        int nomer1, nomer2;

        //deklarasi
        TestPass passed = new TestPass(50,100);
        nomer1 = 10;
        nomer2 = 20;

        //passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer1\t:" + nomer1);
        System.out.println("Nomer2\t:" + nomer2);

        passed.calculate(nomer1,nomer2);
        System.out.println("Nilai setelah passed by value\t: ");
        System.out.println("Nomer1\t:" + nomer1);
        System.out.println("Nomer2\t:" + nomer2);
        System.out.println();

        //passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("passed.nomer1\t:" + passed.nomer1);
        System.out.println("passed.nomer2\t:" + passed.nomer2);
        System.out.println();

        passed.calculate(passed); //method hanya bisa memanggil objek passed
        System.out.println("Nilai sesudah passed by reference\t: ");
        System.out.println("passed.nomer1\t:" + passed.nomer1);
        System.out.println("passed.nomer2\t:" + passed.nomer2);
        System.out.println();

    }
}
