package Fillæseopgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fillæser {

    public static void main(String[] args) {
        calculateAverage("filename.txt");
    }

    public static void calculateAverage(String s) {
        try {
            File myObj = new File(s);
            
            Scanner myReader = new Scanner(myObj);


            int total = 0;
            while (myReader.hasNextLine()) {
                String[] word = myReader.nextLine().split(" ");
                for (int i = 1; i<word.length;i++) {
                    int num = Integer.parseInt(word[i]);
                    total += num;
                }
                System.out.println(word[0]+total);
            }
            

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Hov, der er sket en fejl");
            e.printStackTrace();
        }
    }
}
