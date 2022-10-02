package zad_24_watki;

public class Scigacz implements Runnable{
    private String nazwa;
    public Scigacz (String nazwa){
        this.nazwa = nazwa;

    }
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            System.out.println("Będę pierwszy - to ja " + nazwa);
        }
        System.out.println("Wygrałem, melduje się " + nazwa);
    }
}
