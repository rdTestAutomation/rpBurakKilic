package odev8;

public class Erkek extends Personel {

    public Erkek(String ad, String soyad, int dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    public int emeklilikYasi() {
        int emeklilik =65;
        int yas = 2024-getDogumTarihi();
        return emeklilik - yas;
    }
}