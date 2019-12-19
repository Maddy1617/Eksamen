package Strings;

public class Strings {
    public static void main(String[] args) {
        
    // charAt() bruges til at finde en given karakter ud fra index plads.
    //length()-1, bruges til at finde den sidste char i stringen.
    String fruit = "banana";
    char letter = fruit.charAt(fruit.length()-1);
        if(letter == 'a') {
            System.out.println("Det er helt korrekt Mathias");
        } else {
            System.out.println("Det er sku det forkerte bogstav");
        }
    }
}
