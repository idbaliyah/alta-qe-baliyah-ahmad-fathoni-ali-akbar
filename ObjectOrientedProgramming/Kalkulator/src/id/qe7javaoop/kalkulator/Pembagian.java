package id.qe7javaoop.kalkulator;

public class Pembagian extends Kalkulator {
    double angka1, angka2;

    @Override
    double hasil(){
        double hasil = angka1 / angka2;
        System.out.println("Pembagian = " + hasil);
        return hasil;
    }
}
