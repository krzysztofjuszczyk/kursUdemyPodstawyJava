package watki;

public class Main{
    public static void main(String[] args) {

        Thread obiekt = new Thread(){
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
        obiekt.start();

        Scigacz wyscig1 = new Scigacz("jedynka");
        Scigacz wyscig2 = new Scigacz("dwa");
        Scigacz wyscig3 = new Scigacz("3");

        Thread jeden = new Thread(wyscig1);
        Thread dwa = new Thread(wyscig2);
        Thread trzy = new Thread(wyscig3);
        jeden.start();
        dwa.start();
        trzy.start();


//        Runnable czasoodmierzacz = new Czasoodmierzacz();
//        Thread stoper = new Thread(czasoodmierzacz);
//        stoper.start();
    }
}
