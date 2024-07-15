package odev10_ders14;
import java.util.Arrays;

public class main {

    // 1. Generic bir alan içeren sınıf
    public static class GenericClass<T> {
        private T kelime;

        public GenericClass(T kelime) {
            this.kelime = kelime;
        }

        public T getKelime() {
            return kelime;
        }

        public void printValue() {
            System.out.println("kelime: " + kelime);
        }
    }

    // 2. Koleksiyonda bir öğeyi bulma metodu
    public static <T> T dizedeSayiAra(T[] array, T arananSayi) {
        return Arrays.stream(array)
                .filter(e -> e.equals(arananSayi))
                .findFirst()
                .orElse(null);
    }

    // 3. Stream API kullanarak öğeyi bulma ve -1 döndürme metodu
    public static <T> String dizedeKelimeAra(T[] array, T arananKelime) {
        return Arrays.stream(array)
                .filter(e -> e.equals(arananKelime))
                .findFirst()
                .map(e -> (String) e)  // Casting to Integer to return the value
                .orElse("-1");
    }

    public static void main(String[] args) {

        GenericClass<String> stringInstance = new GenericClass<>("Burak kılıç\n");
        stringInstance.printValue();

        Integer[] sayiDizesi = {1, 2, 3, 4, 5};
        String[] kelimeDizesi={"Fatma","Ayse","Ali","Mustafa"};

        if (dizedeSayiAra(sayiDizesi, 3)!=null) System.out.printf("Sayi dizesinde %d sayısı bulunmaktadır.\n",dizedeSayiAra(sayiDizesi, 3));
        else System.out.printf("Sayi dizesinde %d sayısı bulunmamaktadır.\n",3);

        if (dizedeSayiAra(sayiDizesi, 8)!=null) System.out.printf("Sayi dizesinde %d sayısı bulunmaktadır.\n",dizedeSayiAra(sayiDizesi, 8));
        else System.out.printf("Sayi dizesinde %d sayısı bulunmamaktadır.\n",8);

        System.out.println("\n1. Değer:"+dizedeKelimeAra(kelimeDizesi, "Fatma"));
        System.out.println("2. Değer:"+dizedeKelimeAra(kelimeDizesi, "Burak"));
        System.out.println("Eğer değer bulunamadıysa sonucu -1'dir");
    }
}