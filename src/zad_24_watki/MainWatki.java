package zad_24_watki;

public class MainWatki {
    public static void main(String[] args) {
        Runnable runnableAnonimowe = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        };
        Thread threadZRunnableAnonimowym = new Thread(runnableAnonimowe);
        threadZRunnableAnonimowym.start();

        /*
        //ZADANIE 2

        Thread czasoodmierzaczThread = new Thread(new Czasoodmierzacz());
        czasoodmierzaczThread.start();

        //Zadanie 3
        */

        Scigacz scigaczPierwszyRunnable = new Scigacz("Scigacz nr 1");
        Scigacz scigaczDrugiRunnable = new Scigacz("Scigacz nr 2");

        Thread scigacz1Thread = new Thread(scigaczPierwszyRunnable);
        Thread scigacz2Thread = new Thread(scigaczDrugiRunnable);

        scigacz1Thread.run();
        scigacz2Thread.run();


    }
}
