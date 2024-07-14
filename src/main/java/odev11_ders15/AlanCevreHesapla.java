package odev11_ders15;

public class AlanCevreHesapla {
    // Tek örneği tutan statik değişken
    private static AlanCevreHesapla instance;

    // Private constructor
    private AlanCevreHesapla() {
    }

    // Global erişim noktası sağlayan statik metod
    public static AlanCevreHesapla getInstance() {
        if (instance == null) {
            instance = new AlanCevreHesapla();
        }
        return instance;
    }

    public double kareCevreHesaplama(double kenar) {
        return 4 * kenar;
    }

    public double kareAlanHesaplama(double kenar) {
        return kenar * kenar;
    }

    public double daireCevreHesaplama(double yariCap) {
        return 2 * Math.PI * yariCap;
    }

    public double daireAlanHesaplama(double yariCap) {
        return Math.PI * yariCap * yariCap;
    }

    // Dikdörtgen çevre hesaplama
    public double dikDörtgenCevreHesaplama(double uzunluk, double genislik) {
        return 2 * (uzunluk + genislik);
    }

    // Dikdörtgen alan hesaplama
    public double dikDörtgenAlanHesaplama(double uzunluk, double genislik) {
        return uzunluk * genislik;
    }
}