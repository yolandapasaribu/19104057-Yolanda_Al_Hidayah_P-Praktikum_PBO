package Interface;

public class CD {
    //atribut
    String ukuranCD;
    long hargaCD;

    //constructor
    public CD(String ukuranCD, long hargaCD) {
        this.ukuranCD = ukuranCD;
        this.hargaCD = hargaCD;
    }

    public long getHargaCD() {
        return hargaCD;
    }

    //cetak cd
    public void cetakCD() {
        System.out.println("Ukuran CD\t: " + ukuranCD);
        System.out.println("Harga CD\t: " + hargaCD);
        System.out.println();
    }
}
