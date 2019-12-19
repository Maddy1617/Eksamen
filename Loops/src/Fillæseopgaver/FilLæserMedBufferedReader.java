
package Fillæseopgaver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilLæserMedBufferedReader {
    
    private BufferedReader fil;
    
    public void openFile() {
        
        try {
       // FileReader file = new FileReader("læsfrafil.txt");
       // BufferedReader files = new BufferedReader(file);
         fil = new BufferedReader(new FileReader("læsfrafil.txt"));
    } catch(FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
            e.printStackTrace();
    }
}
    public void readFile() {
        String line;
        try {
            while((line = fil.readLine()) != null) {
                System.out.println(line);
                
            } 
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public void closeFile() {
        try {
            fil.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
