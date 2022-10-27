package kurs_Java_pdf.rozdz9_;

public class PorownywanieObiektow {

    public static void main(String[] args) {
        Osoba o1 = new Osoba("Jan", "Nowak", 25);
        Osoba o2 = o1;
        Osoba o3 = new Osoba("Jan", "Nowak", 25);
        String jakisString = "Jan Nowak";

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        if (o1.equals(o2)) System.out.println("o1 = o2");
        if (o1.equals(o3)) System.out.println("o1 = o3");
        if (o2.equals(o3)) System.out.println("o2 = o3");
        if (o1.equals(jakisString)){
            System.out.println("o1 = String");
        }
        else System.out.println("o1 różne od Stringa");

        if (o1.equals(null)) {
            System.out.println("o1 to null");
        } else {
            System.out.println("o1 nie jest nullem");
        }

    }


}
