package id.qe7javaoop.kalkulator;

public class Pengurangan extends Kalkulator {
    double angka1, angka2;

    @Override
    double hasil(){
        double hasil = angka1 - angka2;
        System.out.println("Pengurangan = " + hasil);
        return hasil;
    }
}
