package zad_21_abstrakcja.Zadanie2;

public class Prostokat implements Figury{
    private double a;
    private double b;

    public Prostokat (double a, double b){
        this.a = a;
        this.b = b;
        }

    @Override
    public double obwod() {
        return 2*(a+b);
    }

    @Override
    public double pole() {
        return a*b;
    }
}
