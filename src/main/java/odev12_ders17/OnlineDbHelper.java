package odev12_ders17;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public class OnlineDbHelper {

    public static void main(String[] args) {

        VeritabaniBaglantisi veritabaniBaglantisi = new VeritabaniBaglantisi();
        Jdbi jdbi = Jdbi.create(veritabaniBaglantisi.getUrl(), veritabaniBaglantisi.getUsername(), veritabaniBaglantisi.getPassword());
        jdbi.installPlugin(new SqlObjectPlugin());

        try (Handle handle = jdbi.open()) {
            // Tablo oluşturma
            handle.execute("CREATE TABLE IF NOT EXISTS kisiler (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "isim VARCHAR(100)," +
                    "yas INT)");

            // CRUD işlemleri
            KisiDao kisiDao = handle.attach(KisiDao.class);

            // Oluşturma
            kisiDao.kisiEkle(new Kisi("Burak KILIC", 30));

            // Okuma
            List<Kisi> kisiler = kisiDao.kisileriListele();
            kisiler.forEach(kisi -> System.out.println(kisi.getIsim() + ", " + kisi.getYas()));

            // Güncelleme
            kisiDao.kisiYasGuncelle(1, 35);

            // Silme
            kisiDao.kisiSil(1);
        }
    }

    public interface KisiDao {
        @SqlUpdate("INSERT INTO kisiler (isim, yas) VALUES (:isim, :yas)")
        void kisiEkle(@BindBean Kisi kisi);

        @SqlQuery("SELECT * FROM kisiler")
        List<Kisi> kisileriListele();

        @SqlUpdate("UPDATE kisiler SET yas = :yas WHERE id = :id")
        void kisiYasGuncelle(@Bind("id") int id, @Bind("yas") int yas);

        @SqlUpdate("DELETE FROM kisiler WHERE id = :id")
        void kisiSil(@Bind("id") int id);
    }

    public static class Kisi {
        private String isim;
        private int yas;

        public Kisi() {}

        public Kisi(String isim, int yas) {
            this.isim = isim;
            this.yas = yas;
        }

        public String getIsim() {
            return isim;
        }

        public int getYas() {
            return yas;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public void setYas(int yas) {
            this.yas = yas;
        }
    }

    public static class VeritabaniBaglantisi {
        private final String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7723979";
        private final String username = "sql7723979";
        private final String password = "kqGSuP1Wuj";

        public String getUrl() {
            return url;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}