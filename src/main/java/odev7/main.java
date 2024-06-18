package odev7;

public class main {
    public static void main(String[] args) {

        for(Planets planet: Planets.values()){

            System.out.println("Gezegenin Adi:" + planet + " -- Sira No:" + planet.planetsNo() +" -- Gunese olan Uzaklıgi:"+ planet.planetsUzaklik()
                            + " -- Capi(1000xkm):" + planet.planetsCap() +"km" + " -- Yil Uzunlugu:" + planet.planetsDon());

        }

    }
}
