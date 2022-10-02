package watki;

public class Czasoodmierzacz implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
