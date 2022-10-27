package kurs_Java_pdf.rozdz9_.niemutowalne;

public class Ksiazka {
    private final String tytul;
    private final String autor;
    private final double cena;

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public double getCena() {
        return cena;
    }

    public Ksiazka(String tytul, String autor, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Ksiazka " + tytul + ", autorstwa: " + autor +" kosztuje: "+ cena;
    }
}
