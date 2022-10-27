package kurs_Java_pdf.rozdz8_TESTY;

public class Testy {



    public static void main(String[] args) {
        wartoscBezwzgledna_wartoscDodatnia_zwracaDodatnia();
        wartoscBezwzgledna_wartoscUjemna_zwracaOdwrotnosc();
        indeksSzukanegoElementu_naPierwszym_Zero();
        indeksSzukanegoElementu_pusta_minusJeden();

    }

    // Główne metody
    public static int wartoscBezwzgledna (int x){
        return x>0 ? x : -x;
    }


    public static boolean czyParzysta (int x){
        return x%2==0;
    }

    public static int indeksSzukanegoElementu (int [] tablica, int szukanyElement){
        for (int x:tablica){
            if (x==szukanyElement) return x;
        }
        return -1;
    }

    //TESTY

    public static void wartoscBezwzgledna_wartoscDodatnia_zwracaDodatnia(){
        int wynik = wartoscBezwzgledna (10);
        if (wynik!=10){
            System.out.println("test oblany");
        }
    }

    public static void wartoscBezwzgledna_wartoscUjemna_zwracaOdwrotnosc(){
        int wynik = wartoscBezwzgledna(-10);
        if (wynik != 10){
            System.out.println("test oblany");
        }
    }


// TESTY z użyciem AssertEquals

    public static void czyParzysta_parzystaDodatnia_true (){
        assertEquals(true, czyParzysta(4));
    }
    public static void czyParzysta_parzystaUjemna_true (){
        assertEquals(true, czyParzysta(-10));
    }

    public static void czyParzysta_nieparzystaDodatnia_false (){
        assertEquals(false, czyParzysta(3));
    }

    public static void czyParzysta_nieparzystaUjemna_false () {
        assertEquals(false, czyParzysta(-9));
    }

    public static void czyParzysta_zero_true (){
        assertEquals(true, czyParzysta(0));
    }

    // TEST przeszukiwanie tablicy

    public static void indeksSzukanegoElementu_pusta_minusJeden(){
        int[] tablicaTest = {};
        assertEqualsTablica(-1, indeksSzukanegoElementu(tablicaTest, 5));
    }

    public static void indeksSzukanegoElementu_naPierwszym_Zero() {
    int [] tablica = {5,12,32};
    assertEqualsTablica(0, indeksSzukanegoElementu(tablica,5));

    }





    public static void assertEquals (boolean expected, boolean actual){
        if (expected != actual){
            System.out.println("Spodziewano się "+ expected + " a otrzymano "+ actual);
        }
    }

    public static void assertEqualsTablica (int expected, int actual){
        if (expected != actual){
            System.out.println("Spodziewano się "+ expected + " a otrzymano "+ actual);
        }
    }

    }
