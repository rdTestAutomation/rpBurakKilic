package odev8;

public abstract class Personel {
    private String ad;
    private String soyad;
    private int dogumTarihi;

    public Personel(String ad, String soyad, int dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getDogumTarihi() {
        return dogumTarihi;
    }

    public abstract int emeklilikYasi();
}