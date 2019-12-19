package Fillæseopgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLæserMedScanner {

    public static void main(String[] args) {
        readFile();
    }
    //Man kan dele denne metode op i tre metoder, openFile(skal bruge try catch), readFile og closeFile.
    public static void readFile()  {
        try {
            Scanner scan = new Scanner(new File("læsfrafil.txt"));
            while (scan.hasNext()) {
                    String navn = scan.next(); //Hvis du vil formattere den tekst du udskriver skal du lave flere variabler. 
                  //    String navn2 = scan.next();
                  //  String navn3 = scan.next();
                    
                    System.out.printf("%s\n",navn);
            }
            scan.close();
            
            
            
            
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finde filen");
            e.printStackTrace(); //får det røde med, så man kan se hvor fejlen stammer fra 
        }
    }

}
