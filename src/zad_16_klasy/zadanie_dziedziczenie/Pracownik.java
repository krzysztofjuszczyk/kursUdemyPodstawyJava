package zad_16_klasy.zadanie_dziedziczenie;

//Utwórz nową klasę “Pracownik”, która będzie dziedziczyć po klasie “Osoba”, a następnie:
//
//        - dodaj nowe pola do klasy "Pracownik": stanowisko i nazwaFirmy
//
//        - dodaj konstruktor, który będzie ustawiał imię, nazwisko, stanowisko, nazwę firmy
//
//        - wykorzystaj konstruktor klasy nadrzędnej do ustawienia imienia i nazwiska
//
//        - przesłoń metodę “przedstawSie()”, aby wypisywała na ekran
//        “Jestem <imie> <nazwisko> i pracuję w firmie <nazwaFirmy> na stanowisku <stanowisko>”
//        np. “Jestem Jan Kowalski i pracuję w firmie XYZ na stanowisku programista”
//
//        - uzupełnij pola, metody, konstruktory w klasach “Osoba” i “Pracownik” o odpowiednie modyfikatory dostępu
//
//        - przetestuj klasę Pracownik w main tworząc obiekt i wywołując metodę “przedstawSie()”

    public class Pracownik extends Osoba{
    String stanowisko;
    String nazwaFirmy;

    Pracownik (){

    }
}
