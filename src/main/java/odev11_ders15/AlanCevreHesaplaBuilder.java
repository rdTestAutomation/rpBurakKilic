package odev11_ders15;

public class AlanCevreHesaplaBuilder {
    private double kenar;     // Kare için
    private double yariCap;   // Daire için
    private double uzunluk;   // Dikdörtgen için
    private double genislik;    // Dikdörtgen için
    private String shapeType;

    private AlanCevreHesaplaBuilder(ShapeBuilder builder) {
        this.kenar = builder.kenar;
        this.yariCap = builder.yariCap;
        this.uzunluk = builder.uzunluk;
        this.genislik = builder.genislik;
        this.shapeType = builder.shapeType;
    }

    public double cevreHesaplama() {
        return switch (shapeType) {
            case "Kare" -> 4 * kenar;
            case "Daire" -> 2 * Math.PI * yariCap;
            case "Dikdortgen" -> 2 * (uzunluk + genislik);
            default -> throw new IllegalStateException("Unexpected value: " + shapeType);
        };
    }

    public double alanHesaplama() {
        return switch (shapeType) {
            case "Kare" -> kenar * kenar;
            case "Daire" -> Math.PI * yariCap * yariCap;
            case "Dikdortgen" -> uzunluk * genislik;
            default -> throw new IllegalStateException("Unexpected value: " + shapeType);
        };
    }

    public static class ShapeBuilder {
        private double kenar;
        private double yariCap;
        private double uzunluk;
        private double genislik;
        private String shapeType;

        public ShapeBuilder setKare(double kenar) {
            this.kenar = kenar;
            this.shapeType = "Kare";
            return this;
        }

        public ShapeBuilder setDaire(double yariCap) {
            this.yariCap = yariCap;
            this.shapeType = "Daire";
            return this;
        }

        public ShapeBuilder setDikdortgen(double uzunluk, double genislik) {
            this.uzunluk = uzunluk;
            this.genislik = genislik;
            this.shapeType = "Dikdortgen";
            return this;
        }

        public AlanCevreHesaplaBuilder build() {
            return new AlanCevreHesaplaBuilder(this);
        }
    }
}