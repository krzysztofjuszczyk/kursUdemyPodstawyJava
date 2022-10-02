package zad_21_abstrakcja;

import zad_21_abstrakcja.Zadanie1.GwiazdaSmierci;
import zad_21_abstrakcja.Zadanie2.Kolo;
import zad_21_abstrakcja.Zadanie2.Prostokat;

public class mainZadaniaInterfejs {
    public static void main(String[] args) {
        System.out.println("zadanie 1");
        GwiazdaSmierci gwiazdaSmierci = new GwiazdaSmierci();
        gwiazdaSmierci.atakujLaserem();

        System.out.println("Zadanie 2");

        Kolo kolo = new Kolo(4);
        Prostokat prostokat = new Prostokat(4,6);

        System.out.println("Kolo obwod: " + kolo.obwod());
        System.out.println("Kolo pole: " + kolo.pole());
        System.out.println("Prostokat obwod: " + prostokat.obwod());
        System.out.println("Prostokat pole: " + prostokat.pole());

        System.out.println("zadanie 3");
        Info infoAnonimowe = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("Informacja wypisana z klasy anonimowej");
            }

        };
           infoAnonimowe.wyswietlInfo();

    }
    interface  Info{
        void wyswietlInfo();
    }
}
