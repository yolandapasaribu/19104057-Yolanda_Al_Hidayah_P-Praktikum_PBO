//Yolanda Al Hidayah Pasaribu - 19104057

package com.yolanda.modul1.Pass;

public class TestPass {
    int nomer1, nomer2;

    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Passed by value
    //paramater pake tipedata primitif
    void calculate (int m, int n){
        m = m* 10;
        n = n/2;
    }
    //Passed by reference
    //reference pake tipe data reference bisa buat tipe data sendir/bisa manipulasi
    //tipe data reference = yang merujuk sebuah clas
    void calculate (TestPass passed){
        passed.nomer1 =nomer1 * 10;
        passed.nomer2 =nomer2 / 2;
    }

}
