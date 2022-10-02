package zad_19_wyjatki.wyjatki;

public class MainZadaniaWyjatki{
    public static void main(String[] args) {
        try {
        int a = 5;
        int b = 0;


            int wynik = a / b;
            System.out.println("wynik: " + wynik);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }
//        System.out.println("doszedłem do końca w main");

        try {
            System.out.println("Wynik dzielenia a/b= " + podziel(6,0 ));
        } catch (DzieleniePrzezZeroException e) {
            System.out.println(e.getMessage());
        }




    }

    public static int podziel(int a, int b) throws DzieleniePrzezZeroException {
        if (b == 0) {
            throw new DzieleniePrzezZeroException();
        } return a / b;
    }
}
