package id.qe7javaoop.menghitungvolume;

public class Balok extends Volume {
    double panjang, lebar, tinggi;

    @Override
    double volume(){
        double volume = panjang * lebar * tinggi;
        System.out.println("Balok = " + volume);
        return volume;
    }
}
