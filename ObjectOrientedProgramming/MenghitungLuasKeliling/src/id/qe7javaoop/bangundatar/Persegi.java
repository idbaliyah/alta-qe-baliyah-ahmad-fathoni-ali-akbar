package id.qe7javaoop.bangundatar;

class Persegi extends BangunDatar {
    double sisi;

    @Override
    double keliling(){
        double keliling = 4 * sisi;
        System.out.println("Persegi = " + keliling);
        return keliling;
    }

    @Override
    double luas(){
        double luas = sisi * sisi;
        System.out.println("Persegi = " + luas);
        return luas;
    }
}

