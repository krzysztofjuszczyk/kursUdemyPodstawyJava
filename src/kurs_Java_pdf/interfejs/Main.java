package kurs_Java_pdf.interfejs;


public class Main {
    public static  final String STRING_FINAL= "Moje testowe zdanie.";


    public static void main (String [] args) {
        Pies pies = new Pies();
        pies.wydajDzwiek();
        Zwierze zwierze = new Pies();
        zwierze.wydajDzwiek();

        zwierze= new Kon();
        zwierze.wydajDzwiek();
        }




//            String[] splitString = STRING_FINAL.split("\s");
//            System.out.println(STRING_FINAL);
//            int x = 1;
//            for (String sub : splitString) {
//                System.out.println(x);
//                System.out.println(sub);
//                x++;
//            }
//
//            System.out.println(STRING_FINAL.replace("\s", "."));


//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        input = input.toLowerCase();
//        if (input.equals("kris")){
//            System.out.println ("wpisales swoje imie");
//        }
//        else
//        {System.out.println ("Nie ma tu twojego imienia");
//        }
//        scanner.close();

        }



