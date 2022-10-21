package id.qe7javaoop.bangundatar;

public class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    @Override
    double keliling(){
        double keliling = (2 * (panjang * lebar));
        System.out.println("Persegi panjang = " + keliling);
        return keliling;
    }

    @Override
    double luas(){
        double luas = panjang * lebar;
        System.out.println("Persegi panjang = " + luas);
        return luas;
    }
}
