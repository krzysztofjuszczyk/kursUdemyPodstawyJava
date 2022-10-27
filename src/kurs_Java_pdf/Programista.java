package kurs_Java_pdf;

public class Programista {
    private String name;
    private String lastName;
    private String language;
    private int pay;

    public Programista (String name, String lastName, String language, int pay){
            this.name=name;
            this.lastName = lastName;
            this.language = language;
            this.pay = pay;

        }


    public String getName(){
        return name;
    }

    public String getLastName (){
        return lastName;
    }

    public String getLanguage(){
        return language;
    }

    public int getPay(){
        return pay;
    }



}
