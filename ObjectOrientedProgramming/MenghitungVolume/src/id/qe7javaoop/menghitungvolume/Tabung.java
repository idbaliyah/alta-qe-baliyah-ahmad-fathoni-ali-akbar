package id.qe7javaoop.menghitungvolume;

public class Tabung extends Volume {
    double jari, tinggi;

    @Override
    double volume(){
        double rumus = (22 * (((jari * jari) * tinggi))/7);
        System.out.println("Tabung = " + rumus);
        return rumus;
    }
}
