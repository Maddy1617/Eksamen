package Whileloops;

public class Loops1 {
    //Anden while loop opgave - forlader loopet når værdien af n = 1
    public static void main(String[] args) {
        int n = 3;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
                
            } else { 
                n = 3 * n + 1;
            }
        }
    }
}
