package zad_24_watki;

public class Czasoodmierzacz implements Runnable {
    @Override
    public void run() {
        int czas = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            czas++;
            System.out.println("Trwam: " + czas + " sekund");
        }
    }
}
