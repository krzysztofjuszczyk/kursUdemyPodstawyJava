package zad_Programista;

import zad_Programista.zadanie1.Programista;
import zad_Programista.zadanie2.Arytmetyka;
import zad_Programista.zadanie3.Matma;

public class Main {

    public static void main(String[] args) {
    Programista programista = new Programista("Krzysztof", "Juszczyk", "polski", 10000);
        System.out.println(programista.pobierzImie());
        System.out.println(programista.pobierzNazwisko());
    programista.pobierzNazwisko();
    programista.pobierzWynagrodzenie();

        int[] tablica1= {3,6,2,1,777,54,12};
        Arytmetyka arytmetyka = new Arytmetyka(tablica1);         //nowy obiekt w klasie

        System.out.println(arytmetyka);
        System.out.println("Suma: " + arytmetyka.sumaElementow());
        System.out.println("Srednia: " + arytmetyka.sredniaElementow());
        System.out.println("Minimum: " + arytmetyka.minWartosc());
        System.out.println("Maksimum: " + arytmetyka.maxWartosc()  );

        System.out.println(Matma.poleKola(4));
        System.out.println(Matma.obwodKola(4));
        System.out.println(Matma.obwodProstokata(4.5, 6.7));
        System.out.println(Matma.poleProstokata( 4.5, 6.7));
    }
}
