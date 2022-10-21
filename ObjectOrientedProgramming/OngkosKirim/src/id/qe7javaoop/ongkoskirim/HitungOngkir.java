package id.qe7javaoop.ongkoskirim;

public class HitungOngkir extends Harga {
    double panjang, lebar, tinggi, berat;

    @Override
    double biayaKG(){
        double minHarga = 5000;
        double volume = (panjang * lebar * tinggi) / 5000;
        double harga = 5000 * berat * volume;
        if (volume <= 50 || berat <= 1 )
            System.out.println("Harga = Rp. "+ minHarga);
        else
            System.out.println("Harga = Rp. " + harga);
        return volume;
    }
}
