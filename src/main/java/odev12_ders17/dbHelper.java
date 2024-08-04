package odev12_ders17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbHelper {

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Personel ("
                + "no INT AUTO_INCREMENT PRIMARY KEY, "
                + "ad_soyad VARCHAR(100) NOT NULL, "
                + "pozisyon VARCHAR(50), "
                + "giris_tarihi DATE)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            System.out.println("Tablo olusturuldu.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String ad, String pozisyon, String girisTarihi) {
        String sql = "INSERT INTO Personel (ad_soyad, pozisyon, giris_tarihi) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ad);
            pstmt.setString(2, pozisyon);
            pstmt.setString(3, girisTarihi);
            pstmt.executeUpdate();
            System.out.println("Data yükleme basarili");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectData() {
        String sql = "SELECT * FROM Personel";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int no = rs.getInt("no");
                String adSoyad = rs.getString("ad_soyad");
                String pozisyon = rs.getString("pozisyon");
                String girisTarihi = rs.getString("giris_tarihi");
                System.out.println("No: " + no + ", Ad Soyad: " + adSoyad + ", Pozisyon: " + pozisyon + ", Giris Tarihi: " + girisTarihi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(int no) {
        String sql = "DELETE FROM Personel WHERE no = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, no);
            pstmt.executeUpdate();
            System.out.println("Data silme basarılı");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createTable();
        insertData("Burak KILIC", "Teklif", "2019-02-04");
        insertData("Ahmet Cakar", "Teklif", "2018-01-04");
        insertData("Gohkan MUTLU", "Proje", "2015-04-06");
        selectData();
        deleteData(1);
        deleteData(2);
        deleteData(3);
        deleteData(4);
        deleteData(5);
    }
}
