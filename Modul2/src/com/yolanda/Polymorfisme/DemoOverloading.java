package com.yolanda.Polymorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 =new Lagu("Lemon");
        Lagu lagu2 = new Lagu("Halu", "Feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
