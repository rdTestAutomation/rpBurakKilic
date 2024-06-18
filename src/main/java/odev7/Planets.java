package odev7;

public enum Planets {
    GUNES(0,0,1324332,224000),
    MERKUR(1,57000,4884,0.2),
    VENUS(2,110000,12346,0.6),
    DUNYA(3,148000,12709,1),
    MARS(4,230000,6767,1.8),
    JUPITER(5,780000,142647,11.6),
    SATURN(6,1438000,124309,29.5),
    URANUS(7, 2970000,51767,84.1),
    NEPTUN(8,4568000,49138,164.8),
    ;

    private int planetsSiraNo;
    private int planetsUzaklikKm;
    private int planetsCapKm;
    private double planetsDonSureYil;

    public int planetsNo() {
        return planetsSiraNo;
    }
    public int planetsUzaklik(){
        return planetsUzaklikKm;
    }
    public int planetsCap(){
        return planetsCapKm;
    }
    public double planetsDon(){
        return planetsDonSureYil;
    }
    Planets(int planetsSiraNo, int planetsUzaklikKkm,int planetsCapKm,double planetsDonSureYil) {
        this.planetsSiraNo = planetsSiraNo;
        this.planetsUzaklikKm= planetsUzaklikKkm;
        this.planetsCapKm =planetsCapKm;
        this.planetsDonSureYil = planetsDonSureYil;
    }

}

