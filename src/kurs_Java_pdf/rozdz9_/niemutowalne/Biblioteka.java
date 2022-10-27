package kurs_Java_pdf.rozdz9_.niemutowalne;

public class Biblioteka{

    private final Ksiazka[] ksiazki;


//konstruktor nowy obiekt
    public Biblioteka(Ksiazka[] ksiazki) {
        this.ksiazki = new Ksiazka[ksiazki.length];

        for (int i=0; i< ksiazki.length; i++){
            this.ksiazki[i] = ksiazki[i];
        }
    }
    //getter  niemutowalny
    public Ksiazka[] getKsiazki() {
        Ksiazka[] tempKsiazki = new Ksiazka[ksiazki.length];

        for (int i=0;i< ksiazki.length ;i++){
            tempKsiazki[i]= ksiazki[i];
        }
        return tempKsiazki;
    }


    public static void main(String[] args) {
    Ksiazka [] wladcaPierscieni = {
          new Ksiazka("cz.1 ", "Tolkien", 34.99),
          new Ksiazka("cz.2 Dwie wieże", "Tolkien", 36.99),
          new Ksiazka("cz.3 Powrót Króla", "Tolkien", 39.99)
        };

    Biblioteka biblioteka = new Biblioteka(wladcaPierscieni);
        System.out.println("Lsita książek:");
        for (Ksiazka pojedKsiazka : biblioteka.ksiazki){
            System.out.println(pojedKsiazka );
        }

    }
}
