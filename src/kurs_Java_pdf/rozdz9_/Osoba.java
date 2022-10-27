package kurs_Java_pdf.rozdz9_;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    public boolean equals (Object o){
        if (o==null || this.getClass()!=o.getClass())
            return false;

        Osoba comparedObject = (Osoba) o;

        if  (   (this.imie == null && comparedObject.imie!=null) ||
                (this.imie != null && !this.imie.equals (comparedObject.imie)) )
                return false;


        if (    (this.nazwisko == null && comparedObject.nazwisko != null) ||
                (this.nazwisko != null && this.nazwisko.equals(comparedObject.nazwisko)) )
            return false;

        return this.wiek == comparedObject.wiek;
    }
}
