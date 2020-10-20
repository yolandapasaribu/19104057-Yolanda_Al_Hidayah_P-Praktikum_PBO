//Yolanda Al Hidayah Pasaribu - 19104057 - SE 03 B
package com.yolanda.tugas1.KonversiSuhu;

public class KonversiSuhu {
    //deklarasi
    public float cel, far, kel, rea;

    //method Celcius Ke Farenheit
    public float getCel() {
        float hasil;
        hasil= (cel *9/5)+32;
        return (hasil);
    }

    public void setCel(float cel) {
        this.cel = cel;
    }

    //method Farenheit ke Kelvin
    public float getFar() {
        float hasil1;
        hasil1 = (far-32)*5/9 +273;
        return (hasil1);
    }

    public void setFar(float far) {
        this.far = far;
    }

    //Method Kelvin ke Reamur
    public float getKel() {
        float hasil2;
        hasil2 = (kel-273)*4/5;
        return (hasil2);
    }

    public void setKel(float kel) {
        this.kel = kel;
    }

    //Method Reamur ke Celcius
    public float getRea() {
        float hasil3;
        hasil3= (rea*5/4);
        return (hasil3);
    }

    public void setRea(float rea) {
        this.rea = rea;
    }
}
