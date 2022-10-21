package id.qe7javaoop.kalkulator;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        Penjumlahan penjumlahan = new Penjumlahan();
        penjumlahan.angka1 = 3;
        penjumlahan.angka2 = 4;

        Pengurangan pengurangan = new Pengurangan();
        pengurangan.angka1 = 15;
        pengurangan.angka2 = 4;

        Perkalian perkalian = new Perkalian();
        perkalian.angka1 = 10;
        perkalian.angka2 = 10;

        Pembagian pembagian = new Pembagian();
        pembagian.angka1 = 12;
        pembagian.angka2 = 3;

        System.out.println("Hasil");
        penjumlahan.hasil();
        pengurangan.hasil();
        perkalian.hasil();
        pembagian.hasil();
    }
}