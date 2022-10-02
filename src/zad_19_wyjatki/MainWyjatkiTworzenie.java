package zad_19_wyjatki;

public class MainWyjatkiTworzenie {
    public static void main(String[] args) {
        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzEmail("jan.kowalski.onet.pl");
            uzytkownik.wprowadzHaslo("qwerttajney123");
            System.out.println("wszystko poszło ok");
        } catch (NiezbytTajneHasloException e) {

            //e.printStackTrace();
            System.out.println("hasło niezbyt bezpieczne...");
        } catch (NiepoprawnyMailException e){
            System.out.println("dodaj @ w mailu");
        }

        System.out.println("czy doszedłem tutaj??");

    }
}
