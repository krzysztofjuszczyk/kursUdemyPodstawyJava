package roz4_instrukcje_warunkowe;

import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;

public class rozdz4 {
    public static void main(String[] args) {
//        System.out.println("Sortowanie tablicy / INSERTION SORT");
//        System.out.println("Z ilu elementów tablica?");
//
//        int[] liczby = new int [getInt()];
//        for (int i = 0; i<liczby.length;  i++){
//            System.out.println("Wpisz liczbę nr: "+ (i+1)  );
//            liczby[i] = getInt();
//
//        }

        String tekst = "Ala ma kota";
        String tekst2 = tekst;
        tekst2 = tekst2.toUpperCase();
        System.out.println("Tekst = " + tekst);
        System.out.println("Tekst2 = " + tekst2);


        System.out.println("Enter a line to check if palindrome:");
        String input = getLine().toLowerCase().replaceAll("\s", "");         // remove spaces and all LowerCase
        if (isPalindrome(input)) System.out.println("it is a palindrome");
        else System.out.println("it is NOT a palindrome");


        int[] liczby = {10, -5, 4, 2, 7, -12, -99, 15, 100};

        for (int i = 0; i < liczby.length; i++)
            System.out.print(liczby[i] + " ");
        System.out.println();
        System.out.println("posortowana tablica");

        int[] posortowane = new int[liczby.length];

        posortowane[0] = liczby[0];
        for (int i = 1; i < liczby.length; i++) {    // sprawdzamy od 2giej liczby
            int sprawadzanaLiczba = liczby[i];

            //trzeba przejść po wszyskich do początku
            for (int j = 0; j < i; j++) {
                if (sprawadzanaLiczba < posortowane[i - j - 1]) {

                    posortowane[i - j] = posortowane[i - j - 1];
                    posortowane[i - j - 1] = sprawadzanaLiczba;

                } else {                                           // większe
                    posortowane[i - j] = sprawadzanaLiczba;
                    break;


                }
            }

            //koniec gł. pętli
        }


        for (int x : posortowane) {
            System.out.print(x + " ");
        }


    }


    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static String getLine() {
        return new Scanner(System.in).nextLine();
    }

    // zlicz znaki w stringu
    public static int howManyChars(String input, char whatChar) {
        int howMany = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == whatChar) {
                howMany++;
            }
        }
        return howMany;
    }
}

