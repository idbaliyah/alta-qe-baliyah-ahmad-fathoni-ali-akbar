package id.qe7javaoop.kalkulator;

public class Penjumlahan extends Kalkulator {
    double angka1, angka2;

    @Override
    double hasil(){
        double hasil = angka1 + angka2;
        System.out.println("Penjumlahan = " + hasil);
        return hasil;
    }
}
