package id.qe7javaoop.bangundatar;

public class Segitiga extends BangunDatar {
    double sisi1, sisi2;

    @Override
    double keliling(){
        double keliling = sisi1 + sisi2 + Math.sqrt((sisi1 * sisi2) + (sisi1 * sisi2));
        System.out.println("Segitiga = " + keliling);
        return keliling;
    }

    @Override
    double luas(){
        double luas = (0.5 * sisi1 * sisi2);
        System.out.println("Segitiga = " + luas );
        return luas;
    }
}
