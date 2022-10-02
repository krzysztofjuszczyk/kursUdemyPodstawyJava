package zad_16_klasy.zadanie3;

public class Matma {
    public static final double PI = 3.14;

    public double r;

    // metody statyczne więc nie będziemy musieli tworzyć obiektu w klasie Matma
    //metoda obwód koła
    public static double obwodKola(double r) {
        return 2 * PI * r;
    }

    //metoda pole koła
    public static double poleKola(double r) {
        return PI * r * r;
    }

    //metoda obwod prostokata
    public static double obowdProstokata(double a, double b) {
        return 2 * (a + b);
    }

    // metoda pole prostokata
    public static double poleProstokata(double a, double b) {
        return a * b;
    }

    // metoda suma
    public static int suma(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return suma;
    }

    //metoda średnia
    public static double srednia(int[] tablica) {
        // double srednia = (double) suma() / (double) tablica.length;      korzystamy z metody wyżej, wersja dłuższa
        return (double) suma(tablica) / tablica.length;
    }

    // metoda wartość minimalna
    public static int minimalna(int[] tablica) {
        int min = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < min) min = tablica[i];
        }
        return min;
    }

    // metoda wartość max
    public static int maksymalna(int[] tablica) {
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max) max = tablica[i];
        }
        return max;

    }
}
