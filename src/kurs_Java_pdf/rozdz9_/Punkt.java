package kurs_Java_pdf.rozdz9_;

public class Punkt {
    private int x;
    private int y;

    Punkt (int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals (Object o){
        if (this == o) {
            return true;
        }

        if (o==null || this.getClass() != o.getClass()){
            return false;
        }

        Punkt other = (Punkt) o;
        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        Punkt a1 = new Punkt (5,2);
        Punkt a2 = new Punkt ( 5,7);
        Punkt a3 = new Punkt (5,2);
        Punkt a4 = a2;

        System.out.println("a1==a2 " + a1.equals(a2));
        System.out.println("a1==a3 " + a1.equals(a3));
        System.out.println("a1==a4 " + a1.equals(a4));
        System.out.println("a2==a4 " + a2.equals(a4));
        System.out.println("a1==null " + a1.equals(null));
    }

}
