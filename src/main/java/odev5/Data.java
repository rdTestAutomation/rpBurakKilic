package odev5;

public class Data {
    int gun;
    int iscilik=250;
    int maas;
    int prim;

    void maasHesapla(){
        maas=gun*iscilik;
        System.out.println("Personelin maasi: " + maas + "TL");
    }
    void primHesapla(){

        int prims = (gun>25) ? prim=(gun-25)*1000 : prim ;
        System.out.println("Personelin primi: " + prim + "TL");


    }

}
