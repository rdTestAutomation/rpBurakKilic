package odev8;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private Personel takimLideri;
    private List<Personel> personelListesi;
    private List<String> gorevListesi;

    public Departman(String ad, Personel takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
        this.personelListesi.add(takimLideri);
    }

    public void takimLideriniDegistir(Personel yeniLider) {
        if (personelListesi.contains(yeniLider)) {
            this.takimLideri = yeniLider;
        } else {
            System.out.println("Takım lideri departman üyesi olmalıdır.");
        }
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public void personelCikar(Personel personel) {
        personelListesi.remove(personel);
    }

    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
    }

    public void gorevTamamla(String gorev) {
        int index = gorevListesi.indexOf(gorev);
        if (index != -1) {
            gorevListesi.set(index, gorev + " (bitti)");
        }
    }

    public void departmanBilgileri() {
        System.out.println("Departman: " + ad);
        System.out.println("Takım Lideri: " + takimLideri.getAd() + " " + takimLideri.getSoyad());
        System.out.println("Personel Listesi:");
        for (Personel personel : personelListesi) {
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " - Emekliliğe kalan yıl: " + personel.emeklilikYasi());
        }
        System.out.println("Görev Listesi:");
        for (String gorev : gorevListesi) {
            System.out.println(gorev);
        }
    }
}