package zad_19_wyjatki.wyjatki;

public class DzieleniePrzezZeroException extends Exception{
    public DzieleniePrzezZeroException(){
        super("Nie wolno dzielić przez zero");
    }
}
