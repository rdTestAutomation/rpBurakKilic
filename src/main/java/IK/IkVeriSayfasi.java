package IK;

import java.util.Arrays;

public class IkVeriSayfasi {
    public static void main(String[] args) {
        Veri personel1 =new Veri();
        Veri personel2 =new Veri();
        String[] personelList=new String[2];

        personel1.adSoyad="Burak KILIÇ";
        personel1.eMail="aaaa@gmail.com";
        personel1.yas= 27;
        personelList[0]=personel1.adSoyad + " " + personel1.eMail + " " + personel1.yas;

        personel2.adSoyad="Ahmet MEHMET";
        personel2.eMail="bbbb@gmail.com";
        personel2.yas= 30;
        personelList[1]=personel2.adSoyad + " " + personel2.eMail + " " + personel2.yas;

        personel1.personelBilgi();
        personel2.personelBilgi();



        System.out.println("Bünyemizde calisan personel listesi:\n" + Arrays.toString(personelList));






    }
}
