package zad_21_abstrakcja_interfejs;

public class KlasaZwykla extends PrzykladowaKlasaAbstrakcyjna{
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisane z klasyZwyklej, metoda publiczna Abstrakcyjna");

    }

    @Override
    protected int metodaAbstrakzyjnaZParametrem(String z) {
        System.out.println("Wypisuje parametr z KlasyZwyklej protected: "+ z);
        return 100;
    }
}
