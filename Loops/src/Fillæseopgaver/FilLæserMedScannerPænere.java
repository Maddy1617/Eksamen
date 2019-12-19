
package Fillæseopgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLæserMedScannerPænere {
    
    private Scanner scan;
    
    public void openFile() {
        try {
            scan = new Scanner(new File("læsfrafil.txt"));
        } catch(FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
            e.printStackTrace();
        }
    }
    public void readFile() {
        while(scan.hasNext()) {
            String navn = scan.next();
            System.out.println(navn);
        }
    }
    public void closeFile() {
        scan.close();
    }
    
    
    
}
