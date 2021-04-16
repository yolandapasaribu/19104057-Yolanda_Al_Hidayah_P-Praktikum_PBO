package Interface;

public class DemoInterface {
    public static void main(String[] args) {
        //objek paket
        Paket paket = new Paket (
                "PBO",
                "YOLOO",
                90000,
                "800 mb",
                85000);

        //hitung paket
        paket.hitungHargaPaket();
        //cetak paket
        paket.cetakPaket();
    }
}
