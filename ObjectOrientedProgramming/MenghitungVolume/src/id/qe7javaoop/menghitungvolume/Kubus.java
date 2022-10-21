package id.qe7javaoop.menghitungvolume;

public class Kubus extends Volume {
    double sisi;

    @Override
    double volume(){
        double volume = sisi * sisi * sisi;
        System.out.println("Kubus = " + volume);
        return volume;
    }
}
