package kurs_Java_pdf;

public class Zadanie_Klasy {
    public static void main(String[] args) {
    zadania_klasy.Programista programista1 = new zadania_klasy.Programista("stasiek", "dupa", "ruski", 4000);
        System.out.println(programista1.getLanguage());
        System.out.println(programista1.getName());
        System.out.println(programista1.getLastName());
        System.out.println(programista1.getPay());
    }
}
