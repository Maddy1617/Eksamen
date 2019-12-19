package Strings;

public class StringIteration {
    public static void main(String[] args) {
        //Her printer jeg hele min string ud med et for loop.
        //Hver gang for loopet kører, skifter I index plads og på den måde skriver den hele stringen ud.
        String fruit = "banana";
        
    for (int i = 0; i < fruit.length(); i++) {
        char letter = fruit.charAt(i);
        System.out.print(letter);
    } System.out.println();
    }
}
