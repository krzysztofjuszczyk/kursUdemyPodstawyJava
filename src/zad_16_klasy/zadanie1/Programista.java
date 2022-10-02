package zad_16_klasy.zadanie1;



public class Programista {
    // tworzymy POLA
    private String imie;
    private String nazwisko;
    private String jezyk;
    private int zarobki;


    public Programista (String podajImie, String podajNazwisko, String podajJezyk, int podajZarobki){
        // KONSTRUKTOR
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }

    public String pobierzImie(){
        return imie;
    }
    public String pobierzNazwisko(){
        return nazwisko;
    }
    public String pobierzJezyk(){
        return jezyk;
    }
    public int pobierzWynagrodzenie(){
        return zarobki;
    }
}
