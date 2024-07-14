package odev11_ders15;

public class main {

    public static void main(String[] args) {

        AlanCevreHesapla hesapla = AlanCevreHesapla.getInstance();
        double kare = 4.0;
        System.out.println("Kare Cevre: " + hesapla.kareCevreHesaplama(kare));
        System.out.println("Kare Alan: " + hesapla.kareAlanHesaplama(kare));

        double daire = 3.0;
        System.out.println("Daire Cevre: " + hesapla.daireCevreHesaplama(daire));
        System.out.println("Daire alan: " + hesapla.daireAlanHesaplama(daire));

        double uzunluk = 5.0;
        double genislik = 2.0;
        System.out.println("Dikdörtgen cevre: " + hesapla.dikDörtgenCevreHesaplama(uzunluk, genislik));
        System.out.println("Dikdörtgen alan " + hesapla.dikDörtgenAlanHesaplama(uzunluk, genislik));
    }
}