package id.qe7javaoop.menghitungvolume;

public class Main {
    public static void main(String[] args) {
        Volume volume = new Volume();

        Kubus kubus = new Kubus();
        kubus.sisi = 10;

        Balok balok = new Balok();
        balok.panjang = 3;
        balok.lebar = 6;
        balok.tinggi = 10;

        Tabung tabung = new Tabung();
        tabung.jari = 7;
        tabung.tinggi = 10;

        volume.display();

        kubus.volume();

        balok.volume();

        tabung.volume();
    }
}
