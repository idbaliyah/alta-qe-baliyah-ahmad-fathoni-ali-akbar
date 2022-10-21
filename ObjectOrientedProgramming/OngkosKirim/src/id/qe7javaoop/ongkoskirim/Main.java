package id.qe7javaoop.ongkoskirim;

public class Main {
    public static void main(String[] args) {
        Harga harga = new Harga();

        HitungOngkir getHarga = new HitungOngkir();
        getHarga.panjang = 5;
        getHarga.lebar = 2;
        getHarga.tinggi = 4;
        getHarga.berat = 1;

        getHarga.biayaKG();
    }
}
