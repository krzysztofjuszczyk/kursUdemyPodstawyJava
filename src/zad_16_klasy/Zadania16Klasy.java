package zad_16_klasy;

import zad_16_klasy.zadanie1.Programista;
import zad_16_klasy.zadanie2.TablicaObliczenia;
import zad_16_klasy.zadanie3.Matma;

public class Zadania16Klasy {

//1. Utwórz klasę o nazwie "Programista", a w niej:
//a) pola: imie, nazwisko, jezyk, zarobki
//b) metody: pobierzImie(), pobierzNazwisko(), pobierzJezyk(), pobierzWynagrodzenie(), które będą zwracać dane z odpowiednich pól
//c) konstruktor, przyjmujący i ustawiający wartości dla wszystkich pól klasy z argumentami: podajImie, podajNazwisko, podajJezyk, podajZarobki
//d) pola będą prywatne a metody i konstruktor publiczne
//e) przetestuj wszystko w main: utwórz obiekt z uzupełnionymi danymi i wywołaj metody, wypisując dane na ekran  '

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        Programista programista = new Programista("Jan", "Kowalski", "java", 5000);
        System.out.println("Imie: " + programista.pobierzImie());
        System.out.println("Nazwisko: "+ programista.pobierzNazwisko());
        System.out.println("Język: " + programista.pobierzJezyk());
        System.out.println("zarobki: "+programista.pobierzWynagrodzenie());

//    2. Napisz klasę, która w konstruktorze będzie przyjmować tablicę oraz będzie posiadać cztery metody:
//            - zliczającą sumę wszystkich elementów z tablicy
//- liczącą średnią
//- znajdującą wartość najmniejszą
//- znajdującą wartość największą
//
//    Każda z metod powinna zwracać wynik jako int.
//    Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
//    Pola będą prywatne a metody i konstruktor publiczne.
//    Klasę, pole i metody nazwij według własnego uznania.
//    Przetestuj całość w main.

        System.out.println("zadanie 2");
        int [] tablica = {5,1,3,6,22,4};
        TablicaObliczenia tablicaObliczenia = new TablicaObliczenia(tablica);
        System.out.println("Suma: "+ tablicaObliczenia.suma());
        System.out.println("średnia: "+ tablicaObliczenia.srednia() );
        System.out.println("min: "+ tablicaObliczenia.minimalna());
        System.out.println("max: "+ tablicaObliczenia.maksymalna());

//        3. Stwórz własną klasę o nazwie “Matma”. Dodaj w niej metody liczące:
//        - obwód i pole koła (jako argument do metody przyjmuje promień koła)
//        - obwód i pole prostokąta (jako argumenty do metody przyjmuje długość boku a i b)
//
//        Metody niech będą statyczne i zwracają wynik odpowiedniego typu.
//                Dodatkowo utwórz w klasie statyczne, stałe pole, które będzie przechowywać wartość PI = 3.14.
//                Do obliczeń koła wykorzystaj Twoje PI.
//                Pola i metody będą publiczne.
//        Jeżeli chcesz, możesz rozszerzyć swoją klasę Matma o metody z zadania 2. Musisz jednak pamiętać,
//        aby delikatnie je przerobić, żeby mogły być metodami statycznymi.

        System.out.println("Obwod koła: "+ Matma.obwodKola(6.66));
        System.out.println("Pole koła: "+ Matma.poleKola(5.1));
        System.out.println("Obwod prostokata: " + Matma.obowdProstokata(6,9));
        System.out.println("Pole prostokata: "+ Matma.poleProstokata(5.5,23.11));

        int[] tab = {1 , 5, 9, 22};
        System.out.println("średnia: "+ Matma.srednia(tab));


    }
}
