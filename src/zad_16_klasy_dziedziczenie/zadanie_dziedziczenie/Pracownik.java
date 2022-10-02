package zad_16_klasy_dziedziczenie.zadanie_dziedziczenie;

public class Pracownik extends Osoba {
    protected String stanowisko;
    protected String nazwaFirmy;

    public Pracownik (String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super (imie, nazwisko);         //konstruktor klasy nadrzędnej MUSI być na pierwszym miejscu;
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.println(         " i pracuję w firmie " +nazwaFirmy+ " na stanowisku " +stanowisko);
    }
}
