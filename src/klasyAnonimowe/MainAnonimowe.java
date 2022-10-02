package klasyAnonimowe;

public class MainAnonimowe  {
    public static void main(String[] args) {
        KlasaTestowa obiekt = new KlasaTestowa();

        // klasa anonimowa
        KlasaTestowa obiektAn = new KlasaTestowa(){
            @Override
            public void wypiszTekst() {
                System.out.println("wypisane z ANONIMOWEJ");
            }
        };

        obiekt.wypiszTekst();
        obiektAn.wypiszTekst();
    }
}
