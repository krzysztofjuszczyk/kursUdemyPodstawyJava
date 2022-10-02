package zad_16_klasy.zadanie2;

public class TablicaObliczenia {


    private int[] tablica;

    public TablicaObliczenia(int[] podajTablice){
        tablica = podajTablice;
    }
    // metoda suma
    public int suma() {
        int suma=0;
        for (int i = 0; i< tablica.length; i++){
            suma+= tablica[i];
        }
        return suma;
    }

    //metoda średnia
    public double srednia (){
       // double srednia = (double) suma() / (double) poleTablicy.length;      korzystamy z metody wyżej, wersja dłuższa
        return (double)suma() / tablica.length;
    }

    // metoda wartość minimalna
    public int minimalna (){
        int min= tablica[0];
        for (int i = 1; i< tablica.length; i++){
            if (tablica[i]<min) min= tablica[i];
        }
        return min;
    }

    // metoda wartość max
    public int maksymalna () {
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max) max = tablica[i];
        }
        return max;
    }
}
