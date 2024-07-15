package odev11_ders15;

public class mainBuilder {
    public static void main(String[] args) {

        AlanCevreHesaplaBuilder Kare = new AlanCevreHesaplaBuilder.ShapeBuilder()
                .setKare(5)
                .build();
        System.out.println("Karenin Cevresi: " + Kare.cevreHesaplama());
        System.out.println("Karenin Alanı: " + Kare.alanHesaplama());

        AlanCevreHesaplaBuilder daire = new AlanCevreHesaplaBuilder.ShapeBuilder()
                .setDaire(3)
                .build();
        System.out.println("Dairenin çevresi: " + daire.cevreHesaplama());
        System.out.println("Dairenin Alanı: " + daire.alanHesaplama());

        AlanCevreHesaplaBuilder dikdortgen = new AlanCevreHesaplaBuilder.ShapeBuilder()
                .setDikdortgen(4, 6)
                .build();
        System.out.println("Dikdörtgenin Çevresi: " + dikdortgen.cevreHesaplama());
        System.out.println("Dikdörtgenin Alanı: " + dikdortgen.alanHesaplama());
    }
}