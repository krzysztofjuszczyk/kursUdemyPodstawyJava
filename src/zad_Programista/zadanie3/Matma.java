package zad_Programista.zadanie3;

public class Matma {
    public static final double MOJE_PI= 3.14;

    public static double obwodKola(double r){
        return 2*MOJE_PI*r;
    }

    public static double poleKola (double r){
        return MOJE_PI*r*r;
    }

    public static double obwodProstokata (double a, double b){
        return 2*(a+b);
    }
    public static double poleProstokata (double a, double b){
        return a*b;
    }

}
