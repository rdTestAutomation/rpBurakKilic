package odev6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        List<String> kelime = new ArrayList<String>();
        List<String> tekrarKelime = new ArrayList<String>();
        List<Character> harfler = new ArrayList<Character>();
        Random rSayi = new Random();
        int sayac = 0;
        kelime.add("kalem");
        kelime.add("kelime");
        kelime.add("elalem");
        kelime.add("kelam");
        kelime.add("bebek");

        for (int i = 0; i < kelime.size(); i++) {
            String tut = null;
            for (int j = 0; j < kelime.get(i).length(); j++) {

                char harf = kelime.get(i).charAt(j);

                for (int k = j + 1; k < kelime.get(i).length(); k++) {

                    char geciciHarf = kelime.get(i).charAt(k);
                    if (geciciHarf == harf) {
                        tut = kelime.get(i);
                        break;
                    }
                }
            }
            if (tut != null) {
                sayac += 1;
                if (sayac != 3) {
                    tekrarKelime.add(tut);
                }
            }

        }
        for (int i = 0; i < tekrarKelime.size(); i++) {
            for (int j = 0; j < tekrarKelime.get(i).length(); j++) harfler.add(tekrarKelime.get(i).charAt(j));
        }


        String rasgeleKelime = "";
        for (int i = 0; i < harfler.size(); i++) {
            rasgeleKelime += harfler.get(rSayi.nextInt(harfler.size()));
        }
        System.out.println("Tekrar eden kelimeler: " + tekrarKelime);
        System.out.println("Tekrar eden kelimelerin harfleri: " + harfler);
        System.out.println("Rasgele oluşturulan kelime: " + rasgeleKelime);


    }
}
