package odev9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int toplamNot = 0;
        while (true) {
            try {

                System.out.print("Sınıf mevcutunu giriniz: ");
                int sinifMuvcut = sc.nextInt();
                int i = 1;
                while (i <= sinifMuvcut) {
                    System.out.printf("%d. öğrencinin notunu:", i);
                    int not = sc.nextInt();
                    if (not < 0 || not > 100) {
                        System.out.println("Öğrenci notu 0 ile 100 arasında olmalıdır.");
                        continue;
                    } else {
                        toplamNot += not;
                        i++;
                    }

                }
                System.out.printf("Sınıfın toplam ortalaması: %d\n", toplamNot / sinifMuvcut);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Hata! Sınıf mevcudu 0 kişi olamaz");
                continue;
            }
            catch (InputMismatchException e){
                throw new StringIfadeHata("Metinsel ifade ");

            }
            catch (Exception e){
                System.out.println("Bir hata ile karşılaşıldı. Program sonlandırıldı.");
                break;
            }
            finally {
                System.out.println("Program sonlandırıldı.");
            }
        }
    }
}


