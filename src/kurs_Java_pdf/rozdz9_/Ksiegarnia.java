package kurs_Java_pdf.rozdz9_;

public class Ksiegarnia {
    public static void main(String[] args) {
        Ksiazka lokomotywa = new Ksiazka();
        lokomotywa.tytul = "Lokomotywa";
        lokomotywa.autor = "Julian Tuwim";
        lokomotywa.ustawCene(29.99);
        Ksiazka ptasieRadio = new Ksiazka(); // 1
        ptasieRadio.tytul = "Ptasie Radio";
        ptasieRadio.autor = "Julian Tuwim";
        ptasieRadio.ustawCene(29.99);
        if (lokomotywa.czyTakaSamaCena(ptasieRadio)) { // 2
            System.out.println("Ksiazki kosztuja tyle samo.");
        } else {
            System.out.println("Cena ksiazek nie jest taka sama.");
        }
    }
}
