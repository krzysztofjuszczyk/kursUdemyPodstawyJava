package kurs_Java_pdf.ZadanieKlasy3;

public class Osoba {
    private String imie;
    private String nazwisko;
    private final int rokUrodzenia;
    private Adres adres;



    public Osoba (String imie, String nazwisko, int rokUrodzenia, Adres adres){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.rokUrodzenia = rokUrodzenia;
    this.adres = adres;
    }

    public Osoba (String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = new Adres (miejscowosc, kodPocztowy, nazwaUlicy, nrDomu);
    }

    @Override
    public String toString() {
        return "Osoba " +
                imie +
                " " + nazwisko +" urodzona w roku " + rokUrodzenia +
                " mieszka pod adresem " + adres +
                '}';
    }

    public static void main(String[] args) {
        Adres adres1 = new Adres("Kielce","25400","konopki", 24);
        Osoba osoba1 = new Osoba("Adam", "Nowak",1977, adres1);
        Osoba osoba2 = new Osoba( "Marcin", "Dodek", 1990, "Skarzysko",
                "26110", "popelki", 11    );

        System.out.println(osoba1);
        System.out.println(osoba2);
    }
}
