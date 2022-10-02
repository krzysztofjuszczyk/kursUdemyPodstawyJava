package zad_21_abstrakcja_interfejs;

public abstract class PrzykladowaKlasaAbstrakcyjna {

    public void wypisywanieNaEkran(){
        System.out.println("wypisane z klasy abstrakcyjnej, metoda publiczna");
    }

    public abstract void metodaAbstrakcyjna ();

    protected abstract int metodaAbstrakzyjnaZParametrem (String z);
    // nie wiemy jak się ma zachowywać metoda, każde zachowanie metody powinno być inne
    //nie mają ciała ale musimy je zaimplementować w klasie która dziedziczy po klasie abstrakcyjnej


}
