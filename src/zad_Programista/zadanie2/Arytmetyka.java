package zad_Programista.zadanie2;
//2. Napisz klasę, która w konstruktorze będzie przyjmować tablicę oraz będzie posiadać cztery metody:
//- zliczającą sumę wszystkich elementów z tablicy
//- liczącą średnią
//- znajdującą wartość najmniejszą
//- znajdującą wartość największą
//
//Każda z metod powinna zwracać wynik jako int.
//Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
//Pola będą prywatne a metody i konstruktor publiczne.
//Klasę, pole i metody nazwij według własnego uznania.
//Przetestuj całość w main.


public class Arytmetyka {

    private int[] tablicaCalkowite;

    public Arytmetyka(int []podajTablice){
        tablicaCalkowite= podajTablice;

    }

    public int sumaElementow(){
        int suma=0;
        for (int i=0; i<tablicaCalkowite.length; i++){
            suma+=tablicaCalkowite[i];
        }
        return suma;
    }

    public double sredniaElementow(){
        return (double)sumaElementow()/ tablicaCalkowite.length;

    }

    public int minWartosc(){
        int minimalna= tablicaCalkowite[0];
        for (int i=1; i<tablicaCalkowite.length;i++){
        minimalna= tablicaCalkowite[i] < minimalna ? tablicaCalkowite[i] : minimalna;

        }

    return minimalna;
    }

    public int maxWartosc(){
        int maksymalna= tablicaCalkowite[0];
        for (int i=1; i<tablicaCalkowite.length;i++){
            maksymalna= tablicaCalkowite[i] > maksymalna ? tablicaCalkowite[i] : maksymalna;

        }
        return maksymalna;
    }


}
