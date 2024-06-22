package odev8;

public class Kadin extends Personel {

    public Kadin(String ad, String soyad, int dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    public int emeklilikYasi() {
        int emeklilik =58;
        int yas = 2024-getDogumTarihi();
        return emeklilik - yas;
    }
}