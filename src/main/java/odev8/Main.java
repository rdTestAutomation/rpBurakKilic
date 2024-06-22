package odev8;

public class Main {
    public static void main(String[] args) {

        Personel lider = new Erkek("Burak", "KILIC", 1999);
        Personel personel1 = new Kadin("Fatma", "GUNDOGDU", 1985);
        Personel personel2 = new Kadin("Ayşe", "COLAK", 1997);
        Departman teklifDep = new Departman("Teklif Departmanı", lider);
        Personel lider2 = new Erkek("Abdullah", "KAYA", 1988);
        Personel personel3 = new Erkek("Gökhan", "MUTLU", 1990);
        Personel personel4 = new Erkek("Resul", "TASHAN", 1981);
        Departman projeDep = new Departman("Proje Departmanı", lider2);
        teklifDep.personelEkle(personel1);
        teklifDep.personelEkle(personel2);
        projeDep.personelEkle(personel3);
        projeDep.personelEkle(personel4);

        teklifDep.gorevEkle("Max royal otel teklifi");
        teklifDep.gorevEkle("Bilişim vadisi ikinci etap revizyonu");
        teklifDep.gorevTamamla("Max royal otel teklifi");
        teklifDep.departmanBilgileri();
        System.out.println("******************************\n");
        teklifDep.takimLideriniDegistir(personel1);
        teklifDep.departmanBilgileri();
        System.out.println("******************************\n");

        projeDep.gorevEkle("world medicine projesinin ADP projesi");
        projeDep.gorevTamamla("world medicine projesinin ADP projesi");
        projeDep.departmanBilgileri();


    }
}