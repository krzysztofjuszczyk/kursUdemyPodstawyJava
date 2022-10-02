package zad_19_wyjatki;

public class Uzytkownik     {
    public void wprowadzHaslo (String haslo) throws NiezbytTajneHasloException {
        if(!haslo.contains("tajne")) {
            throw new NiezbytTajneHasloException();

        }
        // zrob odpowiednie rzeczy z haslem...
    }
    public void wprowadzEmail(String email){
        if(!email.contains("@")) {
            throw new NiepoprawnyMailException();
        }
        //zrob odpowiednie rzeczy z email
    }
}
