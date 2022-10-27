package kurs_Java_pdf.rozdz9_;

public class Ksiazka {
    public String tytul;
    public String autor;
    private double cena;

    public boolean czyTakaSamaCena(Ksiazka innaKsiazka) {
        return cena == innaKsiazka.cena;
    }

    public void ustawCene(double nowaCena) { // 4
        if (czyCenaJestPoprawna(nowaCena)) { // 5
            cena = nowaCena;
        } else {
            System.out.println("Cena " + nowaCena + " jest nieprawidlowa!");
        }
    }

    public String toString() { // 6
        return "Ksiazka o tytule " + tytul +
                ", ktorej autorem jest " + autor + ", kosztuje " + cena;
    }

    private boolean czyCenaJestPoprawna(double cenaDoSprawdzenia) { // 7
        return cenaDoSprawdzenia>0;
    }
}