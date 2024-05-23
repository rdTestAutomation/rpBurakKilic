package odev5;

import java.util.Scanner;

public class Muhasebe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        System.out.print("Personel gün sayısını giriniz: ");
        int gun = scanner.nextInt();

        data.gun=gun;
        data.maasHesapla();
        data.primHesapla();


    }
}
