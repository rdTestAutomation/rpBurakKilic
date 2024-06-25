package odev9;

import java.util.InputMismatchException;

public class StringIfadeHata extends InputMismatchException {
    public StringIfadeHata(String msg){
        super(msg);
        System.out.println("String ifade kullanıldı");


    }
}
