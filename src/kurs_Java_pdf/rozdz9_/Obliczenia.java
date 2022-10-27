package kurs_Java_pdf.rozdz9_;

public class Obliczenia {
    public static int silnia (int x){
        int result = 1;
        for (int a=1;a<=x; a++){
            result *=a;
        }
        return result;
    }

    public static int sumaLiczb (int [] input){
        int result =0;
        for (int i:input){
            result += i;

        //for (int i=0; i<input.length; i++){
        //    result += input[i];
        }
        return result;
    }

}
