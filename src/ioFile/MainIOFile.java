package ioFile;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class MainIOFile {
    public static void main(String[] args) {

//        try {
//            File file = new File("C:\\Users\\KJ\\IdeaProjects\\temp\\src\\test.txt");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Nie znaleziono pliku");;
//        }

        File file = new File("C:\\Users\\KJ\\IdeaProjects\\fragment.txt");


        try {
            Scanner scanner  = new Scanner(System.in);
            System.out.println("wpisz szukany tekst:");
            String phrase = scanner.nextLine().toLowerCase();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("C:\\Users\\KJ\\IdeaProjects\\fragment-kopia.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = bufferedReader.readLine();

//            while (line!= null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
            int count = 0;
            boolean containsPhrase = false;
            int lineNo = 0;
            while (line!= null) {
                lineNo++;
                if (line.toLowerCase().contains(phrase)){
                    containsPhrase=true;
                    System.out.println("Linia nr " + lineNo +":" + line);
                    bufferedWriter.write(line + "\n");
                }
                count += line.length();
                line = bufferedReader.readLine();
            }

//            BufferedReader bufferedReader2 = new BufferedReader(fileReader);
//            int a = bufferedReader2.read();
//            while (a != -1)
//            {count++;
//            a = bufferedReader2.read();}

            System.out.println("liczba znaków: " + count);
            System.out.println("zawiera frazę: " + containsPhrase);

            bufferedReader.close();
            bufferedWriter.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();}
        catch (IOException e){
            System.out.println("IO Exception");
        }



    }
}
