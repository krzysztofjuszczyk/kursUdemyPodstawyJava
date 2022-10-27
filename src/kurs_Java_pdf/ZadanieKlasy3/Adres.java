package kurs_Java_pdf.ZadanieKlasy3;

public class Adres {
     private String miejscowosc;
     private String kodPocztowy;
     private String nazwaUlicy;
     private int nrDomu;

    Adres (){
        System.out.println("nie podałeś danych");
    }

    public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.nrDomu = nrDomu;
    }

    @Override
    public String toString() {
        return nazwaUlicy + " "+ nrDomu + ", " + miejscowosc + ", " + kodPocztowy;
    }

}
