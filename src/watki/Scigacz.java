package watki;

public class Scigacz implements Runnable{
    private String name;

    public Scigacz(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <1000; i++) {
            System.out.println("Będę pierwszy: "+ name);
        }
        System.out.println("KONIEC! KONIEC! KONIEC! KONIEC! KONIEC! KONIEC! KONIEC! Melduje się " + name);
    }
}
