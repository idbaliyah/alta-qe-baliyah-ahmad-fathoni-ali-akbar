package id.qe7javaoop.bangundatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.sisi1 = 3;
        segitiga.sisi2 = 4;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 7;
        persegiPanjang.lebar = 8;

        System.out.println("Keliling");
        persegi.keliling();
        segitiga.keliling();
        persegiPanjang.keliling();

        System.out.println("\nLuas");
        persegi.luas();
        segitiga.luas();
        persegiPanjang.luas();
    }
}
