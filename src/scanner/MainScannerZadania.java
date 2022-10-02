package scanner;

import java.util.Scanner;

public class MainScannerZadania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String imie = scanner.next();
//        String nazwisko = scanner.next();
//        int wzrost = scanner.nextInt();
//        System.out.println("Jestem "+imie+ " "+ nazwisko+ " i mam "+ wzrost + " cm wzrostu.");


//        scanner.useDelimiter(";");
//        while (true){               //(!(wpisano.equals("x")) || !(wpisano.equals("X")))
//            String wpisano=scanner.next();
//            if (wpisano.equalsIgnoreCase("x")) {
//                break;
//            }
//            System.out.println(wpisano);
//        }
        scanner.useDelimiter(";");
//        String tekst;
//        while (!(tekst = scanner.next()).equalsIgnoreCase("x")){
//            System.out.println(tekst);
//            }
        scanner.reset();

//        String linia = scanner.nextLine();
//        int ile = scanner.nextInt();
//
//        for (int i=1; i<=ile; i++){
//            System.out.println(linia);
//        }


        int suma =0;
        System.out.println("Podaj liczbę, obliczę sumę, przerwę gdy podasz ujemną.");
        int ostatniaWczytana = 0;
        do {
            suma = suma+ostatniaWczytana;
            ostatniaWczytana = scanner.nextInt();
        }
        while(ostatniaWczytana>0);
        System.out.println(suma);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Wpisz coś z klawiatury");
//        while (scanner.hasNextInt() ) {
//
//            int wczytany = scanner.nextInt();
//            System.out.println("Wczytałem: " + wczytany);
//        }
//        System.out.println("nie wpisałeś inta");
//    }
//}


        }
}