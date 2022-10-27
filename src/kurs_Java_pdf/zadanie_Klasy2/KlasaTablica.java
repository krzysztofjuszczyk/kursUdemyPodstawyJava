package kurs_Java_pdf.zadanie_Klasy2;

public class KlasaTablica {
    private int [] tablicaInt;

    public KlasaTablica (int [] podajTabliceInt){
        tablicaInt = podajTabliceInt;
    }

    public int suma (){
        int suma =0;
        for (int i=0; i<tablicaInt.length; i++){
            suma+=tablicaInt[i];
        }
        return suma;
    }


}
